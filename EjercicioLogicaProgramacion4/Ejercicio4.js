var n;
function fibonacciSeries(n) {
// Verificar si el número es menor o igual a 0
 if (n <= 0) {
   document.write("Por favor, introduce un número mayor que 0");
  }
//   Generar los primeros dos números de Fibonacci
  else if (n === 1) {
    return 0;
  }
  else if (n === 2) {
    return 1;
  }
//   Generar los siguientes números de Fibonacci
  else {
    return fibonacciSeries(n-1) + fibonacciSeries(n-2);
  }
}

 // Pedir al usuario cuántos números de la serie quiere generar
 var num = parseInt(prompt("¿Cuántos números de Fibonacci quieres generar?"))

 // Generar los números solicitados
 document.write("Los primeros " + num + " números de la Serie de Fibonacci son: ");
 for (var i = 1; i <= num; i++) {
   document.write(fibonacciSeries(i));
 }