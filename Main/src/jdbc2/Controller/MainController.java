package jdbc2.Controller;

import jdbc.JDBCConnector;
import jdbc2.entity.Product;
import jdbc2.repository.ProductRepository;
import jdbc2.service.ProductService;
import jdbc2.service.ProductServiceImpl;
import jdbc2.view.MenuView;
import jdbc2.view.ProductView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in); //숫자만
        Scanner s2 = new Scanner(System.in); //문자열만
        int menu = MenuView.printView(s1);

        ProductService productService = new ProductServiceImpl();
        switch (menu) {
            case 1:
                productService.search(s1,s2);
                break;
            case 2:

                break;
            case 3:

                break;
        }
        s1.close();
        s2.close();
    }

}
