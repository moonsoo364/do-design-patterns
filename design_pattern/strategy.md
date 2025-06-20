## 전략패턴의 핵심 아이디어

행동을 클래스 내부가 아니라 외부에서 캡슐화하여 런타임에 행동을 자유롭게 변경할 수 있게 하는 것

### 전략 패턴 이란?

전략 패턴은 알고리즘군을 정의하고 각각을 캡슐화하여 이를 서로 교체할 수 있도록 한다. 이 패턴을 사용하면 알고리즘을 사용하는 클라이언트와 무관하게 독립적으로 알고리즘을 변경할 수 있다.

## Duck 예제를 통해 전략 패턴 설명

### 1. **전략(Strategy)** = `FlyBehavior`, `QuackBehavior` 인터페이스

```java
public interface FlyBehavior {
    void fly();
}

public interface QuackBehavior {
    void quack();
}

```

### 2. **구현체(Concrete Strategy)** = 실제 행동 클래스들

```java
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}

public class FakeQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Qwak");
    }
}

```

---

### 3. **컨텍스트(Context)** = `Duck` 클래스

```java
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly(); // 위임
    }

    public void performQuack() {
        quackBehavior.quack(); // 위임
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb; // 런타임에 전략 변경 가능
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    abstract void display();
}

```

---

### 4. **구체적인 컨텍스트 객체** = `ModelDuck`

```java
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();       // 전략 주입
        quackBehavior = new Quack();        // 전략 주입
    }

    void display() {
        System.out.println("I'm a model duck");
    }
}

```

## 장점

| 장점 | 설명 |
| --- | --- |
| 행동의 분리 | Duck 클래스는 행동을 직접 구현하지 않음 |
| 재사용성 향상 | FlyBehavior, QuackBehavior 구현체들은 다른 Duck에서도 재사용 가능 |
| 유연한 확장성 | 새 행동을 추가해도 기존 Duck 코드 수정 없이 확장 가능  |
| 런타임 전략 변경 가 | `setFlyBehavior()` 메서드 덕분에 동적으로 전략 변경 가능 |

## 패턴 구조 요약

```
Duck (Context)
 ├─ flyBehavior : FlyBehavior
 ├─ quackBehavior : QuackBehavior
 │
 ├─ performFly()  → flyBehavior.fly()
 ├─ performQuack() → quackBehavior.quack(

```