package X;

import java.util.LinkedList;

/* renamed from: X.1rE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C39991rE extends LinkedList<byte[]> {
    public int byteSize = 0;

    public void A00(byte[] bArr) {
        super.addFirst(bArr);
        int length = bArr.length + 1 + this.byteSize;
        this.byteSize = length;
        while (length > 256) {
            length = this.byteSize - (((byte[]) super.removeLast()).length + 1);
            this.byteSize = length;
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        A00((byte[]) obj);
        return true;
    }
}
