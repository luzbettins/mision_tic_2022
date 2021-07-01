batman = input("Ingrese clave batman :")
flash = input("Ingrese clave flash :")
mensaje = input("Ingrese el mensaje a cifrar :")

ltbat = list(batman)
ltfla = list(flash)
ltms = list(mensaje)

b = 0
f = 0

for i in mensaje:
    if ltbat.count(i) > 0:
        b += 1
    if ltfla.count(i) > 0:
        f += 1
    if b > f:
        print('B', end='')
    elif f > b:
        print('F', end='')
    elif f == b:
        print('j', end='')
