package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: X.1gX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C33831gX implements C0AL {
    public C33841gY A00;
    public C0AM A01;
    public String A02;
    public final JsonReader A03;

    public C33831gX(JsonReader jsonReader) {
        this.A03 = jsonReader;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.1gY] */
    @Override // X.C0AL
    public C0AM AGm() {
        C0AM c0am;
        this.A02 = null;
        this.A00 = null;
        final JsonReader jsonReader = this.A03;
        JsonToken peek = jsonReader.peek();
        int[] iArr = C25241Ep.A00;
        switch (iArr[peek.ordinal()]) {
            case 1:
                c0am = C0AM.NAME;
                break;
            case 2:
                c0am = C0AM.NUMBER;
                break;
            case 3:
                c0am = C0AM.NULL;
                break;
            case 4:
                c0am = C0AM.START_ARRAY;
                break;
            case 5:
                c0am = C0AM.END_ARRAY;
                break;
            case 6:
                c0am = C0AM.START_OBJECT;
                break;
            case 7:
                c0am = C0AM.END_OBJECT;
                break;
            case 8:
                c0am = C0AM.END_DOCUMENT;
                break;
            case 9:
                c0am = C0AM.BOOLEAN;
                break;
            case 10:
                c0am = C0AM.STRING;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown JsonToken ");
                sb.append(peek);
                throw new IllegalStateException(sb.toString());
        }
        this.A01 = c0am;
        switch (iArr[jsonReader.peek().ordinal()]) {
            case 1:
                this.A02 = jsonReader.nextName();
                break;
            case 2:
            case 3:
            case 9:
            case 10:
                this.A00 = new InterfaceC020309j(jsonReader) { // from class: X.1gY
                    public Boolean A00;
                    public String A01;
                    public final JsonToken A02;

                    {
                        JsonToken peek2 = jsonReader.peek();
                        this.A02 = peek2;
                        int i = C25251Eq.A00[peek2.ordinal()];
                        if (i == 1) {
                            this.A00 = Boolean.valueOf(jsonReader.nextBoolean());
                        } else if (i == 2) {
                            jsonReader.nextNull();
                        } else if (i != 3 && i != 4) {
                            throw new IllegalStateException("can't read value");
                        } else {
                            this.A01 = jsonReader.nextString();
                        }
                    }

                    @Override // X.InterfaceC020309j
                    public boolean A5n() {
                        Boolean bool = this.A00;
                        if (bool != null) {
                            return bool.booleanValue();
                        }
                        StringBuilder A0P = C000200d.A0P("type mis matching");
                        A0P.append(this.A02);
                        throw new IOException(A0P.toString());
                    }

                    @Override // X.InterfaceC020309j
                    public double A7R() {
                        String str = this.A01;
                        if (str != null) {
                            return Double.valueOf(str).doubleValue();
                        }
                        StringBuilder A0P = C000200d.A0P("type mis matching");
                        A0P.append(this.A02);
                        throw new IOException(A0P.toString());
                    }

                    @Override // X.InterfaceC020309j
                    public boolean AFY() {
                        return this.A02 == JsonToken.NULL;
                    }

                    @Override // X.InterfaceC020309j
                    public long AG8() {
                        String str = this.A01;
                        if (str != null) {
                            return Long.valueOf(str).longValue();
                        }
                        StringBuilder A0P = C000200d.A0P("type mis matching");
                        A0P.append(this.A02);
                        throw new IOException(A0P.toString());
                    }

                    @Override // X.InterfaceC020309j
                    public Number AGq() {
                        String str = this.A01;
                        if (str != null) {
                            try {
                                return Long.valueOf(str);
                            } catch (NumberFormatException unused) {
                                return Double.valueOf(this.A01);
                            }
                        }
                        StringBuilder A0P = C000200d.A0P("type mis matching");
                        A0P.append(this.A02);
                        throw new IOException(A0P.toString());
                    }

                    @Override // X.InterfaceC020309j
                    public String AVG() {
                        String str = this.A01;
                        if (str != null) {
                            return str;
                        }
                        StringBuilder A0P = C000200d.A0P("type mis matching");
                        A0P.append(this.A02);
                        throw new IOException(A0P.toString());
                    }
                };
                break;
            case 4:
                jsonReader.beginArray();
                break;
            case 5:
                jsonReader.endArray();
                break;
            case 6:
                jsonReader.beginObject();
                break;
            case 7:
                jsonReader.endObject();
                break;
            case 8:
                break;
            default:
                throw new IllegalStateException("unknown JsonToken ");
        }
        return this.A01;
    }

    @Override // X.C0AL
    public String AQg() {
        return this.A02;
    }

    @Override // X.C0AL
    public C0AM AQh() {
        return this.A01;
    }

    @Override // X.C0AL
    public InterfaceC020309j AQi() {
        return this.A00;
    }

    @Override // X.C0AL
    public void AUv() {
        C0AM c0am = C0AM.START_OBJECT;
        C0AM c0am2 = C0AM.START_ARRAY;
        C0AM c0am3 = this.A01;
        if (c0am3 != c0am2 && c0am3 != c0am) {
            return;
        }
        int i = 1;
        while (true) {
            C0AM AGm = AGm();
            if (AGm == c0am2 || AGm == c0am) {
                i++;
            } else if (AGm == C0AM.END_ARRAY || AGm == C0AM.END_OBJECT) {
                i--;
            }
            if (i == 0) {
                return;
            }
        }
    }
}
