capitan = int(input("Ingrese el puntaje de UDH del Capitan America :"))
vision = (capitan * 2)+4
deadpool = (capitan + vision)//5
print(capitan, "", vision, "", deadpool)
if deadpool in range(0, 20):
    print("uno")
if deadpool in range(21, 30):
    print("dos")
if deadpool in range(31, 50):
    print("tres")
if deadpool >= 50:
    print("cuatro")
