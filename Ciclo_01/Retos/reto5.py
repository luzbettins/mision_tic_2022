def colordehieloco(array):
    colores = []
    for i in array:
        if i not in colores:
            colores.append(i)
    return colores


def mefaltandelcolordelhieloco(colores, hielocos, hieloco):
    faltantes = []
    for i in colores:
        if hielocos[i] == hieloco:
            faltantes.append(i)
    return faltantes


def notengo(hielocosP1, hielocosP2):
    meinteresan = []
    for i in hielocosP1:
        if i not in hielocosP2:
            meinteresan.append(i)
    return meinteresan


def puedocambiar(hielocoP1, hielocoP2):
    interesan = [[], []]

    for hieloco in hielocoP1:
        if hieloco not in hielocoP2:
            interesan[0].append(hieloco)
    for hieloco in hielocoP2:
        if hieloco not in hielocoP1:
            interesan[1].append(hieloco)
    if len(interesan[0]) > len(interesan[1]):
        return len(interesan[1])
    else:
        return len(interesan[0])


def puedocambiar(hielocop1, hielocop2):
    intercambiables1 = len(puedocambiar(hielocop1, hielocop2))
    intercambiables2 = len(puedocambiar(hielocop2, hielocop1))
    if intercambiables1 < intercambiables2:
        return intercambiables1
    else:
        return intercambiables2
