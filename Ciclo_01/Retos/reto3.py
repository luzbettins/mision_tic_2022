lista = []
contador = []
i = 0

lineadetiempo = input("Ingrese la línea de tiempo: ")
lineadetiempo = lineadetiempo.split(" ")

for x in range(len(lineadetiempo)):
    if (lineadetiempo[x] not in lista) or (lineadetiempo[x - 1] != lineadetiempo[x]):
        lista.append(lineadetiempo[x])
    if lineadetiempo[x - 1] == lineadetiempo[x]:
        i += 1
    else:
        if i != 0:
            contador.append(i)
            i = 1
        else:
            i += 1
    if (x == len(lineadetiempo) - 1):
        contador.append(i)

print(" ".join(lista))
contador = [str(x) for x in contador]
print(" ".join(contador))
