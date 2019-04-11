import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Order> list = new ArrayList<>();
        Order order;
        do {
            order = new Order(scanner);
            list.add(order);
        } while (order.sum != 0);
        list.remove(list.size() - 1);
        execute(list);
    }

    static class Order {
        int[] ints = new int[6];
        int sum;

        Order(Scanner scanner) {
            for (int i = 0; i < 6; i++) {
                ints[i] = scanner.nextInt();
                sum += ints[i];
            }
        }
    }

    static void execute(List<Order> orders) {
        for (Order order : orders) {
            int sum = 0;
            int[] ints = order.ints;
            while (ints[5] > 0) {
                sum++;
                ints[5]--;
            }
            while (ints[4] > 0) {
                sum++;
                ints[4]--;
                ints[0] -= 11;
            }
            while (ints[3] > 0) {
                sum++;
                ints[3]--;
                if (ints[1] >= 5) {
                    ints[1] -= 5;
                } else {
                    int k = 5 - ints[1];
                    ints[1] = 0;
                    ints[0] -= k * 4;
                }
            }
            while (ints[2] > 0) {
                sum++;
                if (ints[2] >= 4) {
                    ints[2] -= 4;
                } else {
                    if (ints[2] == 1) {
                        if (ints[1] >= 5) {
                            ints[1] -= 5;
                            ints[0]-=7;
                        } else {
                            int k = 5 - ints[1];
                            ints[0] -= 7 + k * 4;
                        }

                    }
                    if (ints[2] == 2) {
                        if (ints[1] >= 3) {
                            ints[1] -= 3;
                        } else {
                            int k = 3 - ints[1];
                            ints[0] -= 6 + k * 4;
                        }

                    }
                    if (ints[2] == 3) {
                        if (ints[1] >= 1) {
                            ints[1] -= 1;
                        } else {
                            ints[0] -= 9;
                        }
                    }
                    ints[2] = 0;
                }
            }
            while (ints[1] > 0) {
                sum++;
                if (ints[1] >= 9) {
                    ints[1] -= 9;
                } else {
                    int k = 9 - ints[1];
                    ints[1] = 0;
                    ints[0] -= 4 * k;
                }
            }
            while (ints[0] > 0) {
                sum++;
                if (ints[0] > 36) {
                    ints[0] -= 36;
                } else {
                    ints[0] = 0;
                }
            }
            System.out.println(sum);
        }
    }
}




