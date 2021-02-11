
#1.Compile Java sources using javac

# Make directory
mkdir -p target/CoffeeMaker_Web/WEB-INF/classes/
mkdir -p target/CoffeeMaker_Web/WEB-INF/classes/edu/ncsu/csc326/coffeemaker/exceptions
# Compile java files
javac src/main/java/edu/ncsu/csc326/coffeemaker/exceptions/*.java
javac -classpath src/main/java/ src/main/java/edu/ncsu/csc326/coffeemaker/*.java
# Copy java files to the directory created.
cp src/main/java/edu/ncsu/csc326/coffeemaker/*.class target/CoffeeMaker_Web/WEB-INF/classes/edu/ncsu/csc326/coffeemaker/
cp src/main/java/edu/ncsu/csc326/coffeemaker/exceptions/*.class target/CoffeeMaker_Web/WEB-INF/classes/edu/ncsu/csc326/coffeemaker/exceptions/
cp -r src/main/webapp/*.jsp target/CoffeeMaker_Web/
cp src/main/webapp/WEB-INF/web.xml target/CoffeeMaker_Web/WEB-INF/
#Package in WAR file
cd target/CoffeeMaker_Web/
jar -cvf ../CoffeeMaker_Web.war *

