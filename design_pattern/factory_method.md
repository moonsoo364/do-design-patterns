모든 팩토리 패턴은 객체 생성을 캡슐화합니다. 아래는 피자와 피자 스토어를 예제 삼아 내용을 설명합니다.

## 생성자 클래스

추상 생상자 클래스로 서브 클래스에서 제품 객체를 생산하려고 구현하는 팩토리 메소드 추상 메서드를 정의합니다.

```java
public abstract class PizzaStore {
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a "+pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
```

1. 서브 클래스에는 추상 메서드를 구현하여 고유한 메서드 로직을 구현합니다.

```java
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
```

```java
public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}

```

## 제품 클래스

제품 클래스는 생성자 클래스에서 만들어지는 클래스입니다.

피자라는 추상 클래스를 상속받아 시카고 치즈 피자, 뉴욕 치즈 피자 라는 2가지 서브 클래스를 생성합니다. 시카고 치즈 피자는 부모의  `cut()` 메서드를 오버라이딩해서 시카고 피자에 맞게 변경합니다.

```java
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Addingg sauce...");
        System.out.println("Adding toppings: ");

        for(String topping : toppings){
            System.out.println("  " + topping);
        }
    }

    void bake() { System.out.println("Bake for 25 min at 350"); }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() { return name; }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
```

```java
public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() { System.out.println("Cutting the pizza into square slices"); }
}
```

```java
public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
```