class Costumer {

    private int id;
    private String name;
    private String product;
    private int quantity;
    
    public Costumer(int id, String name, String product, int quantity) {
        this.id = id;
        this.name = name;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Costumer info [id=" + id + ", name=" + name + ", product=" + product + ", quantity=" + quantity + "]";
    }
    
    
    

    
}
