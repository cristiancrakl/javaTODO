#include <iostream>
using namespace std;

void suma(float num1, float num2)
{
    cout << "La suma es: " << num1 + num2 << endl;
}

void resta(float num1, float num2)
{
    cout << "La resta es: " << num1 - num2 << endl;
}

void multiplicacion(float num1, float num2)
{
    cout << "La multiplicacion es: " << num1 * num2 << endl;
}

void division(float num1, float num2)
{
    if (num2 != 0)
    {
        cout << "La division es: " << num1 / num2 << endl;
    }
    else
    {
        cout << "Error: No se puede dividir por cero." << endl;
    }
}
void menu()
{

    int opcion;
    float num1, num2;

    cout << "Calculadora" << endl;
    cout << "1. Suma" << endl;
    cout << "2. Resta" << endl;
    cout << "3. Multiplicacion" << endl;
    cout << "4. Division" << endl;
    cout << "Ingrese la opcion: ";
    cin >> opcion;

    cout << "Ingrese el primer numero: ";
    cin >> num1;

    cout << "Ingrese el segundo numero: ";
    cin >> num2;

    switch (opcion)
    {
    case 1:
        suma(num1, num2);
        break;
    case 2:
        resta(num1, num2);
        break;
    case 3:
        multiplicacion(num1, num2);
        break;
    case 4:
        division(num1, num2);
        break;
    default:
        cout << "Opcion invalida." << endl;
        break;
    }
}

int main()
{

    menu();

    return 0;
}
