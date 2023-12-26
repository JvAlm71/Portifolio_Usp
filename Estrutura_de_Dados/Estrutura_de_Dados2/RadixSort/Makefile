all: libed myapps

libed:
	gcc -c ./src/radix.c -I ./include -o ./obj/radix.o

myapps:
	gcc ./apps/main.c ./obj/*.o -I ./include -o ./bin/main -lm

run:
	./bin/main

clean:
	rm ./bin/* ./obj/*