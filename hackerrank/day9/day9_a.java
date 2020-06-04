class WagonR extends Car
    {
        protected int mileage;
        protected boolean isSedan;

        public WagonR(int mileage) {
            super(false, "4"); 
            this.mileage=mileage;
        }

        public WagonR(int mileage, boolean isSedan, String seats) {
            super(isSedan, seats); 
            this.mileage=mileage;
        }
        @Override
        public String getMileage() {
            return mileage + " kmpl";
        }
    }

/**
*   HondaCity class
**/
class HondaCity extends Car
    {
        protected int mileage;
        protected boolean isSedan;

        public HondaCity(int mileage) {
            super(true, "4"); 
            this.mileage=mileage;
        }

        public HondaCity(int mileage, boolean isSedan, String seats) {
            super(isSedan, seats); 
            this.mileage=mileage;
        }
        @Override
        public String getMileage() {
            return mileage + " kmpl";
        }
    }

/**
*   InnovaCrysta class
**/
class InnovaCrysta extends Car
    {
        protected int mileage;
        protected boolean isSedan;

        public InnovaCrysta(int mileage) {
            super(false, "6"); 
            this.mileage=mileage;
        }

        public InnovaCrysta(int mileage, boolean isSedan, String seats) {
            super(isSedan, seats); 
            this.mileage=mileage;
        }
        @Override
        public String getMileage() {
            return mileage + " kmpl";
