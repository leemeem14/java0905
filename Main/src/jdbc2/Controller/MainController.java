package jdbc2.Controller;

import jdbc.JDBCConnector;
import jdbc2.entity.Product;
import jdbc2.repository.ProductRepository;
import jdbc2.view.ProductView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) {
        ArrayList<Product> arrList = ProductRepository.getList();
        ProductView.printView(arrList);

    }

}
