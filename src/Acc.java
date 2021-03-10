public class Acc {
        private String name;
        private double money;

        public static class Buil {
        private String name;
        private double money;

        public Buil withN(String name){
            this.name = name;
            return this;
        }

        public Buil withMoney(double money){
            this.money = money;
            return this;
        }

        public Acc build(){

            Acc account = new Acc();
            account.name = this.name;
            account.money = this.money;
            return account;
        }
    }

    private Acc() {}
}