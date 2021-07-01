import json

inventario = input("Ingrese los código de las cajas y su precio: ")
pedido = input("Ingrese los códigos requeridos por el cliente: ")


def disponibles(inventario, pedidodisponible):
    precio = 0
    empandisponibles = []

    inventario = json.loads(inventario)
    pedidodisponible = pedidodisponible.split(' ')

    for pedido in pedidodisponible:
        if pedido in inventario:
            precio += inventario[pedido]
            empandisponibles.append(pedido)

    return precio, empandisponibles


precio, empandisponibles = disponibles(inventario, pedido)

print(precio)
print(" ".join(empandisponibles))
