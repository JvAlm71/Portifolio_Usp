all: libed myapps

libed:
	gcc -c ./src/bubble.c -I ./include -o ./obj/bubble.o

myapps:
	gcc ./apps/main.c ./obj/*.o -I ./include -o ./bin/main -lm

run:
	./bin/main

clean:
	rm ./bin/* ./obj/*
