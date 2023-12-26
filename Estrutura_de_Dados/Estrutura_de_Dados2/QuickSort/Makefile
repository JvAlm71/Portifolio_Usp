all: libed myapps

libed:
	gcc -c ./src/quick.c -I ./include -o ./obj/quick.o

myapps:
	gcc ./apps/main.c ./obj/*.o -I ./include -o ./bin/main -lm

run:
	./bin/main

clean:
	rm ./bin/* ./obj/*
