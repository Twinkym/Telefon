# Telefon
Aquest codi defineix les classes Telèfon i Smartphone, i les interfícies Camera i Rellotge. La classe Smartphone hereta de Telèfon i implementa les interfícies Camera i Rellotge.

La classe Telèfon té dos atributs, "marca" i "model", i un mètode "trucar()" que rep un número de telèfon i mostra un missatge per consola.

Les interfícies Camera i Rellotge tenen un únic mètode cada una: "fotografiar()" i "alarma()", respectivament.

La classe Smartphone implementa els mètodes "fotografiar()" i "alarma()" de les interfícies Camera i Rellotge, i hereta el mètode "trucar()" de Telèfon.

Finalment, des del main(), es crea un objecte Smartphone i s'hi criden els mètodes "trucar()", "fotografiar()" i "alarma()".
