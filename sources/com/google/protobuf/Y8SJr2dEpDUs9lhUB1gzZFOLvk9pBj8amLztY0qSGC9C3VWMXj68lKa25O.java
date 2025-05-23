package com.google.protobuf;

public final class Y8SJr2dEpDUs9lhUB1gzZFOLvk9pBj8amLztY0qSGC9C3VWMXj68lKa25O {
    public final Object[] DrqQ8C7rtVRDTSclHGsDImq;
    public final GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public final int VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    public final String YmFIHVAy6MFnHbke10dLWI57IXCp;

    public Y8SJr2dEpDUs9lhUB1gzZFOLvk9pBj8amLztY0qSGC9C3VWMXj68lKa25O(GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV gpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV, String str, Object[] objArr) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = gpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV;
        this.YmFIHVAy6MFnHbke10dLWI57IXCp = str;
        this.DrqQ8C7rtVRDTSclHGsDImq = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = c | (charAt2 << i);
                return;
            }
        }
    }

    public final String DrqQ8C7rtVRDTSclHGsDImq() {
        return this.YmFIHVAy6MFnHbke10dLWI57IXCp;
    }

    public final GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d() {
        return this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    }

    public final int VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU() {
        return (this.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU & 1) == 1 ? 1 : 2;
    }

    public final Object[] YmFIHVAy6MFnHbke10dLWI57IXCp() {
        return this.DrqQ8C7rtVRDTSclHGsDImq;
    }
}
