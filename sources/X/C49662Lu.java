package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.2Lu */
/* loaded from: classes2.dex */
public class C49662Lu {
    public final List A00;

    public C49662Lu() {
        try {
            this.A00 = Collections.unmodifiableList(Arrays.asList(new C2v7("offline_aa", Arrays.asList(new C60822v6[0]), new InterfaceC60832v8("platform", "android") { // from class: X.3Ah
                public final C60812v5 A01;
                public final String A03;
                public final int A00 = 4;
                public final Class A02 = String.class;

                {
                    this.A03 = r3;
                    this.A01 = new C60812v5(r4, String.class);
                }

                @Override // X.InterfaceC60832v8
                public boolean AFD(C49642Ls c49642Ls) {
                    try {
                        String str = this.A03;
                        Map map = c49642Ls.A00;
                        if (map.containsKey(str)) {
                            C60812v5 c60812v5 = new C60812v5(map.get(str), this.A02);
                            int i = this.A00;
                            switch (i) {
                                case 3:
                                case 4:
                                    return c60812v5.equals(this.A01);
                                case 5:
                                    return !c60812v5.equals(this.A01);
                                case 6:
                                    return c60812v5.compareTo(this.A01) < 0;
                                case 7:
                                    return c60812v5.compareTo(this.A01) > 0;
                                case 8:
                                    return c60812v5.compareTo(this.A01) <= 0;
                                case 9:
                                    return c60812v5.compareTo(this.A01) >= 0;
                                case 10:
                                    throw null;
                                default:
                                    throw new IllegalStateException(C000200d.A0K(C000200d.A0P("Operator with code "), i, " is not currently supported"));
                            }
                        }
                        throw new IllegalArgumentException(C000200d.A0H(str, " has not been set on UserInfo"));
                    } catch (IllegalArgumentException unused) {
                        return false;
                    }
                }

                public boolean equals(Object obj) {
                    if (obj instanceof C66243Ah) {
                        C66243Ah c66243Ah = (C66243Ah) obj;
                        if (this.A03.equals(c66243Ah.A03) && this.A00 == c66243Ah.A00) {
                            C60812v5 c60812v5 = this.A01;
                            if (c60812v5 == null) {
                                if (c66243Ah.A01 != null) {
                                    return false;
                                }
                            } else if (!c60812v5.equals(c66243Ah.A01)) {
                                return false;
                            }
                            return this.A02.equals(c66243Ah.A02);
                        }
                        return false;
                    }
                    return false;
                }

                public int hashCode() {
                    return Arrays.hashCode(new Object[]{this.A03, Integer.valueOf(this.A00), this.A01, null, this.A02});
                }
            }), new C2v7("connect_with_friends_permission_universe", Arrays.asList(new C60822v6[0]), new InterfaceC60832v8(0, new InterfaceC60832v8(1, new InterfaceC60832v8("platform", "smba") { // from class: X.3Ah
                public final C60812v5 A01;
                public final String A03;
                public final int A00 = 4;
                public final Class A02 = String.class;

                {
                    this.A03 = r3;
                    this.A01 = new C60812v5(r4, String.class);
                }

                @Override // X.InterfaceC60832v8
                public boolean AFD(C49642Ls c49642Ls) {
                    try {
                        String str = this.A03;
                        Map map = c49642Ls.A00;
                        if (map.containsKey(str)) {
                            C60812v5 c60812v5 = new C60812v5(map.get(str), this.A02);
                            int i = this.A00;
                            switch (i) {
                                case 3:
                                case 4:
                                    return c60812v5.equals(this.A01);
                                case 5:
                                    return !c60812v5.equals(this.A01);
                                case 6:
                                    return c60812v5.compareTo(this.A01) < 0;
                                case 7:
                                    return c60812v5.compareTo(this.A01) > 0;
                                case 8:
                                    return c60812v5.compareTo(this.A01) <= 0;
                                case 9:
                                    return c60812v5.compareTo(this.A01) >= 0;
                                case 10:
                                    throw null;
                                default:
                                    throw new IllegalStateException(C000200d.A0K(C000200d.A0P("Operator with code "), i, " is not currently supported"));
                            }
                        }
                        throw new IllegalArgumentException(C000200d.A0H(str, " has not been set on UserInfo"));
                    } catch (IllegalArgumentException unused) {
                        return false;
                    }
                }

                public boolean equals(Object obj) {
                    if (obj instanceof C66243Ah) {
                        C66243Ah c66243Ah = (C66243Ah) obj;
                        if (this.A03.equals(c66243Ah.A03) && this.A00 == c66243Ah.A00) {
                            C60812v5 c60812v5 = this.A01;
                            if (c60812v5 == null) {
                                if (c66243Ah.A01 != null) {
                                    return false;
                                }
                            } else if (!c60812v5.equals(c66243Ah.A01)) {
                                return false;
                            }
                            return this.A02.equals(c66243Ah.A02);
                        }
                        return false;
                    }
                    return false;
                }

                public int hashCode() {
                    return Arrays.hashCode(new Object[]{this.A03, Integer.valueOf(this.A00), this.A01, null, this.A02});
                }
            }, new InterfaceC60832v8("platform", "android") { // from class: X.3Ah
                public final C60812v5 A01;
                public final String A03;
                public final int A00 = 4;
                public final Class A02 = String.class;

                {
                    this.A03 = r3;
                    this.A01 = new C60812v5(r4, String.class);
                }

                @Override // X.InterfaceC60832v8
                public boolean AFD(C49642Ls c49642Ls) {
                    try {
                        String str = this.A03;
                        Map map = c49642Ls.A00;
                        if (map.containsKey(str)) {
                            C60812v5 c60812v5 = new C60812v5(map.get(str), this.A02);
                            int i = this.A00;
                            switch (i) {
                                case 3:
                                case 4:
                                    return c60812v5.equals(this.A01);
                                case 5:
                                    return !c60812v5.equals(this.A01);
                                case 6:
                                    return c60812v5.compareTo(this.A01) < 0;
                                case 7:
                                    return c60812v5.compareTo(this.A01) > 0;
                                case 8:
                                    return c60812v5.compareTo(this.A01) <= 0;
                                case 9:
                                    return c60812v5.compareTo(this.A01) >= 0;
                                case 10:
                                    throw null;
                                default:
                                    throw new IllegalStateException(C000200d.A0K(C000200d.A0P("Operator with code "), i, " is not currently supported"));
                            }
                        }
                        throw new IllegalArgumentException(C000200d.A0H(str, " has not been set on UserInfo"));
                    } catch (IllegalArgumentException unused) {
                        return false;
                    }
                }

                public boolean equals(Object obj) {
                    if (obj instanceof C66243Ah) {
                        C66243Ah c66243Ah = (C66243Ah) obj;
                        if (this.A03.equals(c66243Ah.A03) && this.A00 == c66243Ah.A00) {
                            C60812v5 c60812v5 = this.A01;
                            if (c60812v5 == null) {
                                if (c66243Ah.A01 != null) {
                                    return false;
                                }
                            } else if (!c60812v5.equals(c66243Ah.A01)) {
                                return false;
                            }
                            return this.A02.equals(c66243Ah.A02);
                        }
                        return false;
                    }
                    return false;
                }

                public int hashCode() {
                    return Arrays.hashCode(new Object[]{this.A03, Integer.valueOf(this.A00), this.A01, null, this.A02});
                }
            }) { // from class: X.3Ai
                public final int A00;
                public final InterfaceC60832v8 A01;
                public final InterfaceC60832v8 A02;

                {
                    this.A00 = r1;
                    this.A01 = r2;
                    this.A02 = r3;
                }

                @Override // X.InterfaceC60832v8
                public boolean AFD(C49642Ls c49642Ls) {
                    int i = this.A00;
                    if (i == 0) {
                        InterfaceC60832v8 interfaceC60832v8 = this.A02;
                        if (interfaceC60832v8 != null) {
                            return this.A01.AFD(c49642Ls) && interfaceC60832v8.AFD(c49642Ls);
                        }
                        throw null;
                    } else if (i != 1) {
                        if (i == 2) {
                            return !this.A01.AFD(c49642Ls);
                        }
                        throw new IllegalStateException(C000200d.A0K(C000200d.A0P("Operator with code "), i, " is not currently supported"));
                    } else {
                        InterfaceC60832v8 interfaceC60832v82 = this.A02;
                        if (interfaceC60832v82 != null) {
                            return this.A01.AFD(c49642Ls) || interfaceC60832v82.AFD(c49642Ls);
                        }
                        throw null;
                    }
                }

                public boolean equals(Object obj) {
                    if (obj instanceof C66253Ai) {
                        C66253Ai c66253Ai = (C66253Ai) obj;
                        if (this.A00 == c66253Ai.A00 && this.A01.equals(c66253Ai.A01)) {
                            InterfaceC60832v8 interfaceC60832v8 = this.A02;
                            InterfaceC60832v8 interfaceC60832v82 = c66253Ai.A02;
                            if (interfaceC60832v8 == null) {
                                if (interfaceC60832v82 != null) {
                                    return false;
                                }
                            } else if (!interfaceC60832v8.equals(interfaceC60832v82)) {
                                return false;
                            }
                            return true;
                        }
                        return false;
                    }
                    return false;
                }

                public int hashCode() {
                    return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01, this.A02});
                }
            }, new InterfaceC60832v8("release_channel", "beta") { // from class: X.3Ah
                public final C60812v5 A01;
                public final String A03;
                public final int A00 = 4;
                public final Class A02 = String.class;

                {
                    this.A03 = r3;
                    this.A01 = new C60812v5(r4, String.class);
                }

                @Override // X.InterfaceC60832v8
                public boolean AFD(C49642Ls c49642Ls) {
                    try {
                        String str = this.A03;
                        Map map = c49642Ls.A00;
                        if (map.containsKey(str)) {
                            C60812v5 c60812v5 = new C60812v5(map.get(str), this.A02);
                            int i = this.A00;
                            switch (i) {
                                case 3:
                                case 4:
                                    return c60812v5.equals(this.A01);
                                case 5:
                                    return !c60812v5.equals(this.A01);
                                case 6:
                                    return c60812v5.compareTo(this.A01) < 0;
                                case 7:
                                    return c60812v5.compareTo(this.A01) > 0;
                                case 8:
                                    return c60812v5.compareTo(this.A01) <= 0;
                                case 9:
                                    return c60812v5.compareTo(this.A01) >= 0;
                                case 10:
                                    throw null;
                                default:
                                    throw new IllegalStateException(C000200d.A0K(C000200d.A0P("Operator with code "), i, " is not currently supported"));
                            }
                        }
                        throw new IllegalArgumentException(C000200d.A0H(str, " has not been set on UserInfo"));
                    } catch (IllegalArgumentException unused) {
                        return false;
                    }
                }

                public boolean equals(Object obj) {
                    if (obj instanceof C66243Ah) {
                        C66243Ah c66243Ah = (C66243Ah) obj;
                        if (this.A03.equals(c66243Ah.A03) && this.A00 == c66243Ah.A00) {
                            C60812v5 c60812v5 = this.A01;
                            if (c60812v5 == null) {
                                if (c66243Ah.A01 != null) {
                                    return false;
                                }
                            } else if (!c60812v5.equals(c66243Ah.A01)) {
                                return false;
                            }
                            return this.A02.equals(c66243Ah.A02);
                        }
                        return false;
                    }
                    return false;
                }

                public int hashCode() {
                    return Arrays.hashCode(new Object[]{this.A03, Integer.valueOf(this.A00), this.A01, null, this.A02});
                }
            }) { // from class: X.3Ai
                public final int A00;
                public final InterfaceC60832v8 A01;
                public final InterfaceC60832v8 A02;

                {
                    this.A00 = r1;
                    this.A01 = r2;
                    this.A02 = r3;
                }

                @Override // X.InterfaceC60832v8
                public boolean AFD(C49642Ls c49642Ls) {
                    int i = this.A00;
                    if (i == 0) {
                        InterfaceC60832v8 interfaceC60832v8 = this.A02;
                        if (interfaceC60832v8 != null) {
                            return this.A01.AFD(c49642Ls) && interfaceC60832v8.AFD(c49642Ls);
                        }
                        throw null;
                    } else if (i != 1) {
                        if (i == 2) {
                            return !this.A01.AFD(c49642Ls);
                        }
                        throw new IllegalStateException(C000200d.A0K(C000200d.A0P("Operator with code "), i, " is not currently supported"));
                    } else {
                        InterfaceC60832v8 interfaceC60832v82 = this.A02;
                        if (interfaceC60832v82 != null) {
                            return this.A01.AFD(c49642Ls) || interfaceC60832v82.AFD(c49642Ls);
                        }
                        throw null;
                    }
                }

                public boolean equals(Object obj) {
                    if (obj instanceof C66253Ai) {
                        C66253Ai c66253Ai = (C66253Ai) obj;
                        if (this.A00 == c66253Ai.A00 && this.A01.equals(c66253Ai.A01)) {
                            InterfaceC60832v8 interfaceC60832v8 = this.A02;
                            InterfaceC60832v8 interfaceC60832v82 = c66253Ai.A02;
                            if (interfaceC60832v8 == null) {
                                if (interfaceC60832v82 != null) {
                                    return false;
                                }
                            } else if (!interfaceC60832v8.equals(interfaceC60832v82)) {
                                return false;
                            }
                            return true;
                        }
                        return false;
                    }
                    return false;
                }

                public int hashCode() {
                    return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01, this.A02});
                }
            })));
        } catch (JSONException e) {
            StringBuilder A0P = C000200d.A0P("ABConfig/invalid json format for ab property from code gen:");
            A0P.append(e.toString());
            Log.w(A0P.toString());
            StringBuilder A0P2 = C000200d.A0P("ABConfig/invalid json format for ab property from code gen:");
            A0P2.append(e.toString());
            throw new RuntimeException(A0P2.toString());
        }
    }
}
