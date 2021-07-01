import json

inventario = input("Ingrese los código de las cajas y su precio: ")
pedido = input("Ingrese los códigos requeridos por el cliente: ")


def disponibles(inventario, pedidodisponible):
    precio = 0
    empanadas = []

    inventario = json.loads(inventario)
    pedidodisponible = pedidodisponible.split(' ')

    for pedido in pedidodisponible:
        if pedido in inventario:
            precio += inventario[pedido]
            empanadas.append(pedido)

    return precio, empanadas


precio, empanadas = disponibles(inventario, pedido)

print(precio)
print(" ".join(empanadas))
