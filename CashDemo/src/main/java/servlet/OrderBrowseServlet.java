package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import commen.OrderStatus;
import entity.Account;
import entity.Order;
import entity.OrderItem;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/orderbrowse")
public class OrderBrowseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=utf-8");

        Writer writer = resp.getWriter();

        HttpSession session=req.getSession();
        Account account = (Account) session.getAttribute("user");

        List<Order> orders = queryOrderByAccount(account.getId());
        System.out.println("订单明细："+orders);

        if(orders == null || orders.isEmpty()) {
            System.out.println("你还没有产生订单！"+account.getId());
            writer.write("<h2> 你还没有产生订单！"+account.getId()+"</h2>");
        }else {

            System.out.println("===========fsafasfafaf===================");
            //将后端的数据  转换为json字符串
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                //将list转换为json字符串，并将该字符串写到流当中
                objectMapper.writeValue(writer,orders);
                System.out.println("json字符串："+writer.toString());
                //推到前端
                writer.write(writer.toString());
            }catch (Exception e) {
                e.printStackTrace();
            }

         /*   //将后端的数据  转换为json字符串
            ObjectMapper objectMapper = new ObjectMapper();

            //将list转换为json字符串，并将该字符串写到流当中
            objectMapper.writeValue(writer,orders);
            //推到前端
            writer.write(writer.toString());*/

        }
    }

    public List<Order> queryOrderByAccount(Integer accountId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Order> orderList = new ArrayList<>();

        try {
            String sql = "select o1.id              as order_id,\n" +
                    "       o1.account_id      as account_id,\n" +
                    "       o1.create_time     as create_time,\n" +
                    "       o1.finish_time     as finish_time,\n" +
                    "       o1.actual_amount   as actual_amount,\n" +
                    "       o1.total_money     as total_money,\n" +
                    "       o1.order_status    as order_status,\n" +
                    "       o1.account_name    as account_name,\n" +
                    "       o2.id              as item_id,\n" +
                    "       o2.goods_id        as goods_id,\n" +
                    "       o2.goods_name      as goods_name,\n" +
                    "       o2.goods_introduce as goods_introduce,\n" +
                    "       o2.goods_num       as goods_num,\n" +
                    "       o2.goods_unit      as goods_unit,\n" +
                    "       o2.goods_price     as goods_price,\n" +
                    "       o2.goods_discount  as goods_discount\n" +
                    "from `order` as o1\n" +
                    "         left join order_item as o2 on\n" +
                    "          o1.id = o2.order_id\n" +
                    "where o1.account_id = ? order by order_id;";
            connection = DBUtil.getConnection(true);
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,accountId);

            resultSet = preparedStatement.executeQuery();

            Order order = null;
            //组织订单内容
            while (resultSet.next()) {

                if(order == null) {
                    order = new Order();
                    extractOrder(order,resultSet);
                    orderList.add(order);
                }

                String orderId = resultSet.getString("order_id");

                if(!orderId.equals(order.getId())) {
                    order = new Order();
                    extractOrder(order,resultSet);
                    orderList.add(order);
                }
                OrderItem orderItem = extractOrderItem(resultSet);
                order.getOrderItemList().add(orderItem);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,preparedStatement,resultSet);
        }
        return orderList;
    }

    public OrderItem extractOrderItem(ResultSet resultSet) throws SQLException {

        OrderItem orderItem = new OrderItem();
        orderItem.setId(resultSet.getInt("item_id"));
        orderItem.setGoodsId(resultSet.getInt("goods_id"));
        orderItem.setGoodsName(resultSet.getString("goods_name"));
        orderItem.setGoodsIntroduce(resultSet.getString("goods_introduce"));
        orderItem.setGoodsNum(resultSet.getInt("goods_num"));
        orderItem.setGoodsUnit(resultSet.getString("goods_unit"));
        orderItem.setGoodsPrice(resultSet.getInt("goods_price"));
        orderItem.setGoodsDiscount(resultSet.getInt("goods_discount"));
        return orderItem;
    }

    public void extractOrder(Order order,ResultSet resultSet) throws SQLException{
        order.setId(resultSet.getString("order_id"));
        order.setAccount_id(resultSet.getInt("account_id"));
        order.setAccount_name(resultSet.getString("account_name"));
        order.setCreate_time(resultSet.getString("create_time"));
        order.setFinish_time(resultSet.getString("finish_time"));
        order.setActual_amount(resultSet.getInt("actual_amount"));
        order.setTotal_money(resultSet.getInt("total_money"));
        order.setOrder_status(OrderStatus.valueOf(resultSet.getInt("order_status")));
    }

}

