package academy.devdojo.maratonajava.javacore.ZZBcomportamento.intefaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // anônimas, funções, conciso
    boolean test(Car car);
    //(parametro) -> <expressão>
    //(Car car) - > car.getColor.equals("green");
}
