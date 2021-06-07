Algoritmo pseudocodigoEjercicio5
	Escribir "Ingrese la cantidad de personas a registrar: "
	Leer N
	x = 1
	Masculino = 0
	Femenino = 0
	Mientras x<=n Hacer
		Escribir "Ingrese la edad: "
		Leer edad
		Escribir "Ingrese un numero dependiendo de su sexo: 1 = masculino o 2 = femenino: "
		Leer sexo
		si sexo==1 Entonces
			si edad<18 Entonces
				Masculino=masculino+1
				
			FinSi
		SiNo
			si	sexo==2 Entonces
				si edad>=18 Entonces
					Femenino=femenino+1
				FinSi
			SiNo
				Escribir "Escribe un numero correcto"
				x = x-1
			FinSi
		FinSi
		x = x+1
	Fin Mientras
	Escribir "Las mujeres mayores de edad son: ",Femenino
	Escribir "Los hombres menores de edad son: ",Masculino
FinAlgoritmo
