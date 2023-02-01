# ReadMe pour DSL
#### Par Julie AYOUBI, Tristan CHARVIN et Tom ROY
***
Dans ce git vous trouverez notre DSL, nommé avec beaucoup d'inspiration "newDsl".

Dans l'état actuel, notre DSL est capable de:
- lire un .json donné en paramètre de la façon suivante : read("path.json")
- montrer le dernier .json lu avec : show()
- ecrire un .csv en spécifiant le chemin et en fournissant un JSON en paramètre : writeCSV("Path.csv",{"Var1" = "Foo";"Var2" = 1;})
- ecrire un .csv le dernier .json lu et en spécifiant le chemin : write CSV("Path.csv")
- ecrire un .json en spécifiant le chemin et en fournissant un JSON en paramètre : writeJSON("Path.json,{"Var1" = "Foo";"Var2" = 1;})
- ajouter au dernier .json lu une nouvelle valeur fournir en paramètre : add({"Var5"="NewFoo";})
- retirer au dernier .json une valeur en fournissant en paramètre le nom de l'attribut : remove("Var1")
- recuperer l'attribut mis en paramètre du dernier .json lu: get("Var2")

Vous trouverez dans le dossier :

```
newDSL/org.xtext.example.mydsl.tests/src/org/xtext/example/mydsl/tests
```
Les deux compilateurs (Python et JQ) ainsi que le ParserXtend qui a permis de réaliser les différents tests.

Vous trouverez également dans le dossier :

```
newDSL/org.xtext.example.mydsl/src/org/xtext/example/mydsl/MyDsl.xtext
```
Le fichier MyDsl.xtext contenant toutes les règles sur la grammaire de notre DSL. 



## Example code newDSL
```
#1 
read("my_json.json")
show

#2
writeCSV("my_json_to_csv.csv")

#3
writeJSON("my_new_json.json",{Var1 = "Foo", Var2 = 0, Var3 = "FooFoo"})
writeCSV("my_new_json.csv",{Var1 = "Foo", Var2 = 0, Var3 = "FooFoo"})

#4
read("Tous_mes_bars.json")
add({"Bar6" = "Bar a thon"})
show

#5
read("Tous_mes_bars.json")
remove("Bar1")
show

#6
read("Tous_mes_bars.json")
get("Bar2")
show
```