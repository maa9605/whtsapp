package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0RU  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RU<E> extends C0CY<E> {
    public static final C0RU A01;
    public final List A00;

    static {
        C0RU c0ru = new C0RU();
        A01 = c0ru;
        ((C0CY) c0ru).A00 = false;
    }

    public C0RU() {
        this.A00 = new ArrayList(10);
    }

    public C0RU(List list) {
        this.A00 = list;
    }

    @Override // X.C0CX
    public C0CX AGZ(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.A00);
            return new C0RU(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        A00();
        this.A00.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        A00();
        Object remove = this.A00.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        A00();
        Object obj2 = this.A00.set(i, obj);
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.A00.size();
    }
}
