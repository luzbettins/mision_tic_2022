import json

inventario = input("Ingrese los código de las cajas y su precio: ")
pedido = input("Ingrese los códigos requeridos por el cliente: ")


def disponibles(inventario, pedidoDisponible):
    precio = 0
    empanadasDisponibles = []

    inventario = json.loads(inventario)
    pedidoDisponible = pedidoDisponible.split(' ')

    for pedido in pedidoDisponible:
        if pedido in inventario:
            precio += inventario[pedido]
            empanadasDisponibles.append(pedido)

    return precio, empanadasDisponibles


precio, empanadasDisponibles = disponibles(inventario, pedido)

print(precio)
print(" ".join(empanadasDisponibles))
