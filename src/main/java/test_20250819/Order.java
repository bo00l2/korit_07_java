package test_20250819;

public class Order {
    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    public void showOrderInfo(){
        System.out.println("주문번호 : " + orderId);
        System.out.println("상품명 : " + productName);
        System.out.println("구매자 : " + consumerName);
        System.out.println("가격 : " + price);
        System.out.println("수량 : " + stock);
    }

    private Order(Builder builder){
        this.orderId = builder.orderId;
        this.productName = builder.productName;
        this.consumerName = builder.consumerName;
        this.price = builder.price;
        this.stock = builder.stock;
    }

    public static class Builder {
        private int orderId;
        private String productName;
        private String consumerName;
        private int price;
        private int stock;



        public  Builder orderId(int orderId){
            this.orderId = orderId;
            return this;
        }

        public  Builder productName(String productName){
            this.productName = productName;
            return this;
        }

        public  Builder consumerName(String consumerName){
            this.consumerName = consumerName;
            return this;
        }

        public  Builder price(int price){
            this.price = price;
            return this;
        }

        public  Builder stock(int stock){
            this.stock = stock;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

    }
    public static void main(String[] args) {
        Order Order1 = new Builder().orderId(100).consumerName("홍길동")
                .productName("Samsung GalaxyBook2 Pro").price(1450000).stock(2).build();
        Order1.showOrderInfo();
    }
}
