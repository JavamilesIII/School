noten = {'de':[6.0,5.1],'fr':[4.0],'mt':[4.0,4.1]}
'''
de = noten.get('de')
fr = noten.get('fr')
mt = noten.get('mt')
x = input('Durchschnitt von welchem Fach (de,fr,mt): ')
if x == 'de':
    print('DE: ',sum(de)/len(de))
elif x == 'fr':
    print('FR: ',sum(fr)/len(fr))
elif x == 'mt':
    print('MT: ',sum(mt)/len(mt))'''

'''for i in noten:
    x=noten.get(i)
    print(sum(x)/len(x))'''
for fach, notenliste in noten:
    if notenliste != 0:
        print(fach.upper,': ',sum(notenliste)/len(notenliste))
    else:
        print(fach.upper,': ', 0)