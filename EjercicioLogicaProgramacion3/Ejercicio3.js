let num = parseInt(prompt("Ingrese un número para calcular su factorial"));
let factorial=1;

if (Number.isNaN(num) === true){
    document.write("Ingrese un número entero");
} else {
    for(let i = 1; i<= num; i ++){
        factorial = factorial*i;
    }
    document.write("El factorial de " + num+ " es " + factorial);
}