package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.View;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3xI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86353xI extends AbstractC81493oz {
    public final AbstractC005302j A00;
    public final AnonymousClass267 A01;
    public final C81643pE A02;
    public final InterfaceC002901k A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final Map A07;
    public final boolean A08;

    @Override // X.C0ZT
    public boolean A0E(View view, Object obj) {
        return view == obj;
    }

    public C86353xI(Context context, InterfaceC002901k interfaceC002901k, AnonymousClass267 anonymousClass267, Resources resources, C81643pE c81643pE, List list, List list2, List list3, AbstractC005302j abstractC005302j, boolean z) {
        super(context, resources);
        this.A07 = new HashMap();
        this.A03 = interfaceC002901k;
        this.A01 = anonymousClass267;
        this.A02 = c81643pE;
        this.A04 = list;
        this.A06 = list2;
        this.A05 = list3;
        this.A00 = abstractC005302j;
        this.A08 = z;
    }

    @Override // X.C0ZT
    public int A0B() {
        int size = this.A04.size();
        List list = this.A06;
        return list != null ? size + list.size() : size;
    }

    public final void A0F(C2Z4 c2z4, int i) {
        c2z4.A02.setVisibility(0);
        c2z4.A03.setVisibility(0);
        c2z4.A01.setVisibility(8);
        final AnonymousClass267 anonymousClass267 = this.A01;
        final Uri uri = (Uri) this.A04.get(i);
        final C81533p3 c81533p3 = new C81533p3(this, c2z4, i);
        if (anonymousClass267 != null) {
            C0HS c0hs = new C0HS(anonymousClass267, uri, c81533p3) { // from class: X.3p2
                public final Uri A00;
                public final AnonymousClass267 A01;
                public final C81533p3 A02;

                {
                    this.A01 = anonymousClass267;
                    this.A00 = uri;
                    this.A02 = c81533p3;
                }

                @Override // X.C0HS
                public void A03(Object[] objArr) {
                    this.A02.A00(((C71463Wf[]) objArr)[0]);
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    C71463Wf c71463Wf;
                    InterfaceC02170Ad A00;
                    BufferedInputStream bufferedInputStream;
                    long j;
                    String path = this.A00.getPath();
                    if (path != null) {
                        File file = new File(path);
                        AnonymousClass267 anonymousClass2672 = this.A01;
                        Bitmap A01 = anonymousClass2672.A01(file);
                        if (A01 != null) {
                            super.A02.A00(new C71463Wf(1, A01));
                        }
                        String str = file.getName().split("\\.")[0];
                        AnonymousClass268 anonymousClass268 = anonymousClass2672.A05;
                        File A012 = anonymousClass268.A01(str);
                        if (A012 != null) {
                            Bitmap A013 = anonymousClass2672.A01(A012);
                            if (A013 != null) {
                                return new C71463Wf(2, A013);
                            }
                            throw null;
                        }
                        try {
                            if (!anonymousClass2672.A02.A05()) {
                                C000700j.A06(true);
                                return new C71463Wf(3, null);
                            }
                            try {
                                C26B c26b = anonymousClass2672.A06;
                                String str2 = c26b.A00.A00.getResources().getDisplayMetrics().density >= 2.0f ? "xxhdpi" : "hdpi";
                                HashMap hashMap = new HashMap();
                                hashMap.put("category", "wallpaper");
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append("_");
                                sb.append(str2);
                                hashMap.put("id", sb.toString());
                                A00 = c26b.A00(c26b.A01.A01(), C43981yK.A08(hashMap));
                            } catch (IOException unused) {
                                C000700j.A06(true);
                                c71463Wf = new C71463Wf(4, null);
                            }
                            try {
                                if (A00 == null) {
                                    C000700j.A06(true);
                                    c71463Wf = new C71463Wf(4, null);
                                } else {
                                    String A0H = C000200d.A0H(str, ".jpg");
                                    try {
                                        bufferedInputStream = new BufferedInputStream(new C43991yL(((C0JL) A00).AAe(), anonymousClass268.A00, 0));
                                    } catch (IOException e) {
                                        Log.e("DownloadableWallpaperStorage/storeFullResolutionWallpaper/Failed!", e);
                                    }
                                    try {
                                        File A02 = anonymousClass268.A02(true);
                                        if (!A02.exists() && !AnonymousClass024.A0h(A02)) {
                                            Log.e("DownloadableWallpaperStorage/store/Could not prepare temporary cache subdirectory");
                                            bufferedInputStream.close();
                                        } else {
                                            long j2 = 0;
                                            File file2 = new File(A02, A0H);
                                            int i2 = 8192;
                                            byte[] bArr = new byte[8192];
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                while (true) {
                                                    j = i2 + j2;
                                                    if (j > 2097152) {
                                                        break;
                                                    }
                                                    try {
                                                        int read = bufferedInputStream.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream.write(bArr, 0, read);
                                                        j2 += read;
                                                        i2 = 8192;
                                                    } finally {
                                                    }
                                                }
                                                fileOutputStream.close();
                                                if (j > 2097152) {
                                                    Log.e("DownloadableWallpaperStorage: File being saved is too large.");
                                                    bufferedInputStream.close();
                                                } else {
                                                    File file3 = new File(anonymousClass268.A02(false), A0H);
                                                    if (file3.exists()) {
                                                        file3.delete();
                                                    }
                                                    try {
                                                        AnonymousClass024.A0Q(anonymousClass268.A02, file2, file3);
                                                        File A014 = anonymousClass268.A01(str);
                                                        if (A014 != null) {
                                                            Bitmap A015 = anonymousClass2672.A01(A014);
                                                            if (A015 != null) {
                                                                c71463Wf = new C71463Wf(2, A015);
                                                                A00.close();
                                                            } else {
                                                                throw null;
                                                            }
                                                        } else {
                                                            throw null;
                                                        }
                                                    } catch (IOException unused2) {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append("DownloadableWallpaperStorage/storeFullResolutionWallpaper : rename failed, from ");
                                                        sb2.append(file2.toString());
                                                        sb2.append(" to ");
                                                        sb2.append(file3.toString());
                                                        Log.e(sb2.toString());
                                                        bufferedInputStream.close();
                                                    }
                                                }
                                            } catch (FileNotFoundException e2) {
                                                Log.e("DownloadableWallpaperStorage/storeFullResolutionWallpaper/", e2);
                                                bufferedInputStream.close();
                                            }
                                        }
                                        C000700j.A06(true);
                                        c71463Wf = new C71463Wf(5, null);
                                        A00.close();
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } finally {
                                            try {
                                                bufferedInputStream.close();
                                            } catch (Throwable unused3) {
                                            }
                                        }
                                    }
                                }
                                return c71463Wf;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    if (A00 != null) {
                                        try {
                                            A00.close();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    throw th3;
                                }
                            }
                        } finally {
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    throw null;
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    C71463Wf c71463Wf = (C71463Wf) obj;
                    if (!A04()) {
                        this.A02.A00(c71463Wf);
                        return;
                    }
                    Bitmap bitmap = c71463Wf.A01;
                    if (bitmap == null) {
                        return;
                    }
                    bitmap.recycle();
                }
            };
            C0HS c0hs2 = (C0HS) this.A07.put(Integer.valueOf(i), c0hs);
            if (c0hs2 != null) {
                c0hs2.A05(true);
            }
            this.A03.ARy(c0hs, new Void[0]);
            return;
        }
        throw null;
    }
}
