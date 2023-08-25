all: libed myapps

libed:
	gcc -c ./src/heap.c -I ./include -o ./obj/heap.o

myapps:
	gcc ./apps/main.c ./obj/*.o -I ./include -o ./bin/main -lm

run:
	./bin/main

clean:
	rm ./bin/* ./obj/*
