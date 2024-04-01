package com.whatsapp.emoji;

import X.AbstractC43921yD;
import X.C43941yG;
import X.C55162jy;
import X.C55172jz;
import X.C55182k0;
import X.C55192k1;
import X.C55202k2;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class EmojiDescriptor {
    public static int A00(AbstractC43921yD abstractC43921yD, boolean z) {
        short s = 0;
        do {
            int A00 = abstractC43921yD.A00();
            if (A00 != 0) {
                int binarySearch = Arrays.binarySearch(C55162jy.A00, (int) C55172jz.A00[s], (int) C55182k0.A00[s], A00);
                if (binarySearch < 0) {
                    if (z) {
                        return -1;
                    }
                    return C55192k1.A00[s];
                }
                s = C55202k2.A00[binarySearch];
            } else {
                return C55192k1.A00[s];
            }
        } while (s >= 0);
        if (!z) {
            if (s != -1) {
                return -s;
            }
            return -1;
        } else if (abstractC43921yD.A00() != 0 || s == -1) {
            return -1;
        } else {
            return -s;
        }
    }

    public static int A01(int[] iArr) {
        return A00(new C43941yG(iArr), false);
    }

    public static int getDescriptor(AbstractC43921yD abstractC43921yD) {
        return A00(abstractC43921yD, false);
    }
}
