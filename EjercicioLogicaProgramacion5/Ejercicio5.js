/* function saltarlinea(){
    document.write("<br>");
    document.write("<br>");
    document.write("<br>");
}

function imprimir(frase){
    document.write(frase)
    saltarlinea();
} */

var numeroAdivinar = Math.round(Math.random()*100);
var intentos = 5;
var contador = 1;


while(contador <= intentos){

    var numeroIngresado = parseInt(prompt("Ingrese un número entre 0-100"));

    if (numeroAdivinar == numeroIngresado){
        alert("Felicidades, adivinaste el número secreto.");
        break;
    }

    else{

        alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.")


    }

    contador++;
}

if (numeroAdivinar == numeroIngresado){
        document.write("Acertaste :), en el intento " + contador + " el número pensado era " + numeroAdivinar);

    }

    else{

        document.write("Fallaste :( , el numero pensado era " + numeroAdivinar +"<br><br>");
        
        

    }

document.write("<br><br>El último número ingresado fue " + numeroIngresado + "<br><br>FIN")