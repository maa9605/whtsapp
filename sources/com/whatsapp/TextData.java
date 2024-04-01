package com.whatsapp;

import X.C000200d;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class TextData implements Serializable {
    public static final long serialVersionUID = 1;
    public int backgroundColor;
    public int fontStyle;
    public int textColor;
    public byte[] thumbnail;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextData.class == obj.getClass()) {
            TextData textData = (TextData) obj;
            if (this.fontStyle == textData.fontStyle && this.textColor == textData.textColor && this.backgroundColor == textData.backgroundColor) {
                byte[] bArr = this.thumbnail;
                byte[] bArr2 = textData.thumbnail;
                if (bArr != bArr2) {
                    if (bArr == null) {
                        return bArr2.length == 0;
                    } else if (bArr2 == null) {
                        if (bArr.length != 0) {
                            return false;
                        }
                    } else {
                        return Arrays.equals(bArr, bArr2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("TextData; fontStyle=");
        A0P.append(this.fontStyle);
        A0P.append("; textColor=");
        A0P.append(this.textColor);
        A0P.append("; backgroundColor=");
        A0P.append(this.backgroundColor);
        A0P.append("; thumbnail=");
        byte[] bArr = this.thumbnail;
        A0P.append(bArr == null ? "null" : Integer.valueOf(bArr.length));
        return A0P.toString();
    }
}
