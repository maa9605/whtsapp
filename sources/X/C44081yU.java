package X;

import java.util.Comparator;
import java.util.PriorityQueue;

/* renamed from: X.1yU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44081yU {
    public final PriorityQueue A00 = new PriorityQueue(5, new Comparator() { // from class: X.1yf
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            AbstractC44101yW abstractC44101yW = (AbstractC44101yW) obj;
            AbstractC44101yW abstractC44101yW2 = (AbstractC44101yW) obj2;
            return (abstractC44101yW2 != null ? abstractC44101yW2.A01 : 0) - (abstractC44101yW == null ? 0 : abstractC44101yW.A01);
        }
    });
}
