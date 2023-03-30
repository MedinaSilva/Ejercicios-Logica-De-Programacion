let a = parseInt(prompt("Ingrese el primer valor"));
let b = parseInt(prompt("Ingrese el segundo valor"));
let c = parseInt(prompt("Ingrese el tercer valor"));
let menor, medio, mayor;

if (a < b && a <c){
    menor = a;
    if (b <= c){
    
        medio = b;
        mayor = c;
    }else {
        medio = c;
        mayor = b;
    }
} else if (b < a && b < c){
    menor = b;
    if (a <= c){
        medio = a;
        mayor = c;
    } else{
        medio = c;
        mayor = a;
    }
}else {
    menor = c;
    if (a <= b){
        medio = a;
        mayor = b;
    }else{
        medio = b;
        mayor = a; 
    }
}

document.write("Los valores ordenados de menor a mayor son: ");
document.write(menor + ", " + medio + ", " + mayor);
document.write("<br>");
document.write("<br>");
document.write("Los valores ordenados de mayor a menor son: ");
document.write(mayor + ", " + medio + ", " + menor);