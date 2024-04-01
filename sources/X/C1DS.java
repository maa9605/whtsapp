package X;

/* renamed from: X.1DS  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1DS {
    public static final C1DS[] A00 = {new C1DS() { // from class: X.1fW
        @Override // X.C1DS
        public boolean A00(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }, new C1DS() { // from class: X.1fX
        @Override // X.C1DS
        public boolean A00(int i, int i2) {
            return (i & 1) == 0;
        }
    }, new C1DS() { // from class: X.1fY
        @Override // X.C1DS
        public boolean A00(int i, int i2) {
            return i2 % 3 == 0;
        }
    }, new C1DS() { // from class: X.1fZ
        @Override // X.C1DS
        public boolean A00(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    }, new C1DS() { // from class: X.1fa
        @Override // X.C1DS
        public boolean A00(int i, int i2) {
            return (((i2 / 3) + (i >> 1)) & 1) == 0;
        }
    }, new C1DS() { // from class: X.1fb
        @Override // X.C1DS
        public boolean A00(int i, int i2) {
            int i3 = i * i2;
            return (i3 % 3) + (i3 & 1) == 0;
        }
    }, new C1DS() { // from class: X.1fc
        @Override // X.C1DS
        public boolean A00(int i, int i2) {
            int i3 = i * i2;
            return (((i3 % 3) + (i3 & 1)) & 1) == 0;
        }
    }, new C1DS() { // from class: X.1fd
        @Override // X.C1DS
        public boolean A00(int i, int i2) {
            return ((((i * i2) % 3) + ((i + i2) & 1)) & 1) == 0;
        }
    }};

    public abstract boolean A00(int i, int i2);
}
