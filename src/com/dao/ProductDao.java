package com.dao;
import com.entity.Product;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class ProductDao {

 	public static void main(String[] args) {
        System.out.println( "--- 系统启动开始 ---" );
        ArrayList<Product> list = new ArrayList<Product>();
        // 商品初始化
        init(list);
        while (true) {
            // 打印菜单;
            mainmenu();
          chooseFun( list);
    }


    }





    private static void chooseFun(ArrayList<Product> list) {
        System.out.println("输入您选择的功能");
        Scanner sc = new Scanner(System.in);
        String choose = sc.next();
        switch (choose) {
            case "1": // 库存查询
                		showList(list);
                		break;
                		case "2":
                		    // 添加库存
                            addList(list);
                            break;
                            case "3":
                                // 删除商品
                                delList(list);
                                break;
                                case "4":
                                    // 修改商品
                                    editList(list);
                                    break;
                                    case "5":
                                        // 退出系统
                                        System.out.println("退出系统");
                                        return;
                                        default:
                                            System.out.println("对不起，没有您输入的功能，请重新选择");
                                            break;
        }
 	}



    private static void init(ArrayList<Product> list) {
        Product p1 = new Product();
        p1.name="大米";
        p1.ID=001;
        p1.shelf=12;

        Product p2 = new Product();
        p2.name="白面";
        p2.ID=002;
        p2.shelf=12;

        Product p3 = new Product();
        p3.name="油";
        p3.ID=003;
        p3.shelf=12;
    }
    // 打印菜单
    private static void mainmenu() {
        System.out.println("==== 欢迎光临超市  ====");
        System.out.println("1:查询货物  2：添加新货物 3:删除货物 4：修改货物");
        System.out.println("5：退出系统");

    }

    private static int chooseFunction() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

    //查
    private static void showList(ArrayList<Product> list) {
        System.out.println("=======================商品库存清单=======================");
        System.out.println("商品编号\t商品名称\t\t商品保质期");
        for (int i = 0; i < list.size(); i++) {
            Product P1 = list.get(i);
            System.out.println(P1.ID + "\t" + P1.name + "\t" + P1.shelf);
        }
 	}
//增
    private static void addList(ArrayList<Product> list) {
      Product p1 = new Product();
      Scanner sc = new Scanner(System.in);
      System.out.println("输入商品编号：");
      p1.ID = sc.nextInt();
      System.out.println("输入商品名称：");
       p1.name = sc.next();
       System.out.println("输入商品保质期：");
      p1.shelf = sc.nextInt();
       list.add(p1);
 	}
 	//删
    private static void delList(ArrayList<Product> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要删除的商品编号：");
        int num = sc.nextInt();		// 删除集合元素
         for (int i = 0; i < list.size(); i++) {
           Product thisItem = list.get(i);
           if (thisItem.ID == num) {
               list.remove(thisItem);
               System.out.println("商品删除完毕!");
               return;
           }
         }
         System.out.println("对不起，没有这个编号的商品!");
 	}


//改
    private static void editList(ArrayList<Product> list) {
        System.out.println("输入需要修改的商品编号：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();		// 更新集合元素
         for (int i = 0; i < list.size(); i++) {
             Product thisItem = list.get(i);
             if (thisItem.ID == num) {
                 System.out.print("请输入新的商品ID:");
                 thisItem.ID = sc.nextInt();
                 System.out.print("请输入新的商品名称:");
                 thisItem.name = sc.next();
                 System.out.print("请输入新的商品保质期:");
                 thisItem.shelf = sc.nextInt();
                 System.out.println("商品信息更新完毕!");
                 return;			}
         }
         System.out.println("对不起，没有这个编号的商品!");
 	}


    public static Product updatelist(Product product) {
        return null;
    }

    public static void deleteList() {

    }

    public static List<Product> findAll() {
        return null;
    }

    public static Product getOne(int id) {
        return null;
    }
}


