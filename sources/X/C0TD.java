package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0TD */
/* loaded from: classes.dex */
public class C0TD extends AbstractC05910Qs implements Runnable, C0I3 {
    public int A00;
    public C011005l A01;
    public final C03340Fh A02;
    public final C0ES A03;
    public final C04500Kk A04;
    public final C41991uq A05;
    public final String A06;
    public final List A07;
    public final boolean A08;

    public void A01() {
    }

    public C0TD(C41991uq c41991uq, C0ES c0es, C03340Fh c03340Fh, C011005l c011005l, String str, List list, int i, C04500Kk c04500Kk) {
        this(c41991uq, c0es, c03340Fh, c011005l, str, list, i, c04500Kk, true);
    }

    public C0TD(C41991uq c41991uq, C0ES c0es, C03340Fh c03340Fh, C011005l c011005l, String str, List list, int i, C04500Kk c04500Kk, boolean z) {
        Log.a(c011005l != null);
        this.A05 = c41991uq;
        this.A03 = c0es;
        this.A02 = c03340Fh;
        this.A01 = c011005l;
        this.A06 = str;
        this.A07 = list;
        this.A00 = i;
        this.A04 = c04500Kk;
        this.A08 = z;
        if (list != null) {
            Arrays.deepToString(list.toArray());
        }
    }

    public C0TD(C41991uq c41991uq, C0ES c0es, C03340Fh c03340Fh, C011005l c011005l, List list, int i) {
        this(c41991uq, c0es, c03340Fh, c011005l, null, list, i, null);
    }

    @Override // X.AbstractC05910Qs
    public void A00() {
        C000200d.A1F(C000200d.A0P("groupmgr/group_request/timeout/type:"), this.A00);
        super.A01 = true;
        int i = this.A00;
        if (i != 30) {
            switch (i) {
                case 15:
                    C0ES.A02(1002, this.A01);
                    break;
                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                    C0ES.A02(1001, this.A01);
                    break;
                case 17:
                    C0ES.A02(1007, this.A01);
                    break;
                default:
                    switch (i) {
                        case 91:
                            C0ES.A02(1005, this.A01);
                            break;
                        case 92:
                            C0ES.A02(1006, this.A01);
                            break;
                        case 93:
                            C0ES.A02(1004, this.A01);
                            break;
                    }
            }
        } else {
            C0ES.A02(1003, this.A01);
        }
        C04500Kk c04500Kk = this.A04;
        if (c04500Kk != null) {
            this.A05.A0E(c04500Kk.A01, 500);
        }
        this.A02.A07(this.A01, false);
        A01();
    }

    @Override // X.C0I3
    public void ARv(int i) {
        StringBuilder A0Q = C000200d.A0Q("groupmgr/request failed : ", i, " | ");
        A0Q.append(this.A01);
        A0Q.append(" | ");
        A0Q.append(this.A00);
        Log.e(A0Q.toString());
        cancel();
        int i2 = this.A00;
        if (i2 != 30) {
            if (i2 != 159) {
                if (i2 != 161) {
                    if (i2 != 213 && i2 != 224) {
                        switch (i2) {
                            case 15:
                                if (i == 401) {
                                    C0ES.A02(2011, null);
                                    break;
                                } else if (i == 408) {
                                    C0ES.A02(3007, null);
                                    break;
                                } else if (i == 429) {
                                    C0ES.A02(3005, null);
                                    break;
                                } else if (i == 403) {
                                    C0ES.A02(2012, null);
                                    break;
                                } else if (i != 404) {
                                    C0ES.A02(2010, null);
                                    break;
                                } else {
                                    C0ES.A02(2013, null);
                                    break;
                                }
                            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                if (i == 403) {
                                    C0ES.A02(2023, null);
                                    break;
                                } else if (i != 404) {
                                    C0ES.A02(2022, null);
                                    break;
                                } else {
                                    C0ES.A02(2024, null);
                                    break;
                                }
                            case 17:
                                if (i == 401) {
                                    C0ES.A02(2006, null);
                                    break;
                                } else if (i == 406) {
                                    C0ES.A02(2009, this.A06);
                                    break;
                                } else if (i == 403) {
                                    C0ES.A02(2007, null);
                                    break;
                                } else if (i != 404) {
                                    C0ES.A02(2005, null);
                                    break;
                                } else {
                                    C0ES.A02(2008, null);
                                    break;
                                }
                            default:
                                switch (i2) {
                                    case 91:
                                    case 92:
                                        if (i == 401) {
                                            C0ES.A02(2019, null);
                                            break;
                                        } else if (i == 403) {
                                            C0ES.A02(2020, null);
                                            break;
                                        } else if (i != 404) {
                                            C0ES.A02(2018, null);
                                            break;
                                        } else {
                                            C0ES.A02(2021, null);
                                            break;
                                        }
                                    case 93:
                                        C0ES.A02(2025, null);
                                        break;
                                }
                        }
                    }
                } else if (i == 401) {
                    C0ES.A02(3010, null);
                } else if (i == 403) {
                    C0ES.A02(3011, null);
                } else if (i == 405) {
                    C0ES.A02(3014, null);
                } else if (i != 419) {
                    C0ES.A02(3012, null);
                } else {
                    C0ES.A02(3013, null);
                }
            }
            if (i == 400) {
                C0ES.A02(3018, null);
            } else if (i == 401) {
                C0ES.A02(3010, null);
            } else if (i != 403) {
                C0ES.A02(3012, null);
            } else {
                C0ES.A02(3011, null);
            }
        } else if (i == 401) {
            C0ES.A02(2015, null);
        } else if (i == 403) {
            C0ES.A02(2016, null);
        } else if (i != 404) {
            C0ES.A02(2014, null);
        } else {
            C0ES.A02(2017, null);
        }
        C04500Kk c04500Kk = this.A04;
        if (c04500Kk != null) {
            this.A05.A0E(c04500Kk.A01, i);
        }
        this.A02.A07(this.A01, false);
        A01();
    }

    @Override // java.lang.Runnable
    public void run() {
        cancel();
        StringBuilder sb = new StringBuilder("groupmgr/request success/");
        sb.append(this.A00);
        Log.i(sb.toString());
        A01();
    }
}
