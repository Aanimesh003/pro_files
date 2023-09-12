
    interface Shape {
        void setWidth(int w);
        void setHeight(int h);
    }
    
    interface Color {
        void setColor(String c);
    }
    
    class Rectangle implements Shape, Color {
        private int width;
        private int height;
        private String color;
    
        public void setWidth(int w) {
            width = w;
        }
        public void setHeight(int h) {
            height = h;
        }
        public void setColor(String c) {
            color = c;
        }
    
        public int getArea() {
            return width * height;
        }
    
        public String getColor() {
            return color;
        }
    }
    
    public class Multiple_inheritence {
        public static void main(String[] args) {
            Rectangle rect = new Rectangle();
            rect.setWidth(5);
            rect.setHeight(10);
            rect.setColor("red");
            System.out.println("Area: " + rect.getArea());
            System.out.println("Color: " + rect.getColor());
        }
    }
    

