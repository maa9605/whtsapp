package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Gd */
/* loaded from: classes2.dex */
public final class C48652Gd extends AbstractC48662Ge {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public AudioManager.OnAudioFocusChangeListener A06;
    public Uri A07;
    public C06260Si A08;
    public C39351pz A09;
    public AnonymousClass124 A0A;
    public C38O A0B;
    public ExoPlaybackControlView A0C;
    public AbstractC73093b5 A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final Activity A0Q;
    public final Handler A0R;
    public final InterfaceC21130yq A0S;
    public final C018508q A0T;
    public final C02E A0U;
    public final InterfaceC002901k A0V;
    public final C83943sw A0W;
    public final C86593xt A0X;

    public C48652Gd(C018508q c018508q, InterfaceC002901k interfaceC002901k, C02E c02e, C002301c c002301c, Activity activity, Uri uri, AbstractC83883sq abstractC83883sq, AbstractC73093b5 abstractC73093b5) {
        this(c018508q, interfaceC002901k, c02e, activity, true, (C83943sw) null, abstractC73093b5, false);
        this.A07 = uri;
        abstractC83883sq.A00 = new C83793sh(this);
        this.A0A = abstractC83883sq;
    }

    public C48652Gd(C018508q c018508q, InterfaceC002901k interfaceC002901k, C02E c02e, Activity activity, boolean z, C83943sw c83943sw, AbstractC73093b5 abstractC73093b5, boolean z2) {
        this.A0R = new Handler(Looper.getMainLooper());
        this.A07 = new Uri.Builder().build();
        this.A00 = Integer.MAX_VALUE;
        this.A04 = 5;
        this.A03 = -1;
        this.A02 = 0;
        this.A0S = new InterfaceC21130yq() { // from class: X.3sv
            @Override // X.InterfaceC21130yq
            public void ALa(boolean z3) {
            }

            @Override // X.InterfaceC21130yq
            public void AN0(C21120yp c21120yp) {
            }

            @Override // X.InterfaceC21130yq
            public /* synthetic */ void AN4(int i) {
            }

            @Override // X.InterfaceC21130yq
            public /* synthetic */ void AOS() {
            }

            @Override // X.InterfaceC21130yq
            public /* synthetic */ void APd(AbstractC21230z0 abstractC21230z0, Object obj, int i) {
            }

            {
                C48652Gd.this = this;
            }

            @Override // X.InterfaceC21130yq
            public void AN2(C20930yW c20930yW) {
                String str;
                if (c20930yW.type == 1) {
                    Exception exc = (Exception) c20930yW.cause;
                    if (exc instanceof C10B) {
                        C10B c10b = (C10B) exc;
                        if (c10b.decoderName != null) {
                            str = "error instantiating decoder";
                        } else if (c10b.getCause() instanceof C10E) {
                            str = "error querying decoder";
                        } else {
                            str = c10b.secureDecoderRequired ? "error no secure decoder" : "no secure decoder";
                        }
                        StringBuilder A0W = C000200d.A0W("ExoPlayerVideoPlayer/error in playback errorMessage=", str, " playerid=");
                        C48652Gd c48652Gd = C48652Gd.this;
                        A0W.append(c48652Gd.hashCode());
                        Log.e(A0W.toString(), c20930yW);
                        c48652Gd.A0M(c48652Gd.A0Q.getString(R.string.error_video_playback), true);
                    }
                }
                str = null;
                StringBuilder A0W2 = C000200d.A0W("ExoPlayerVideoPlayer/error in playback errorMessage=", str, " playerid=");
                C48652Gd c48652Gd2 = C48652Gd.this;
                A0W2.append(c48652Gd2.hashCode());
                Log.e(A0W2.toString(), c20930yW);
                c48652Gd2.A0M(c48652Gd2.A0Q.getString(R.string.error_video_playback), true);
            }

            /* JADX WARN: Code restructure failed: missing block: B:140:0x007f, code lost:
                if (r10 != false) goto L62;
             */
            /* JADX WARN: Removed duplicated region for block: B:131:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC21130yq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void AN3(boolean r10, int r11) {
                /*
                    Method dump skipped, instructions count: 264
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C83933sv.AN3(boolean, int):void");
            }

            @Override // X.InterfaceC21130yq
            public void APq(C220910z c220910z, C222111l c222111l) {
                hashCode();
                C48652Gd c48652Gd = C48652Gd.this;
                C221811i c221811i = c48652Gd.A09.A00;
                if (c221811i != null) {
                    if (c221811i.A00(2) == 1) {
                        Log.i("ExoPlayerVideoPlayer/unplayable video track");
                        c48652Gd.A0M(c48652Gd.A0Q.getString(R.string.error_video_playback), true);
                    } else if (c221811i.A00(1) == 1) {
                        Log.i("ExoPlayerVideoPlayer/unplayable audio track");
                        c48652Gd.A0M(c48652Gd.A0Q.getString(R.string.error_video_playback), true);
                    }
                }
            }
        };
        this.A0T = c018508q;
        this.A0V = interfaceC002901k;
        this.A0U = c02e;
        this.A0Q = activity;
        C86593xt c86593xt = new C86593xt(activity, z2);
        this.A0X = c86593xt;
        c86593xt.setLayoutResizingEnabled(z);
        this.A0W = c83943sw;
        this.A0D = abstractC73093b5;
    }

    public final InterfaceC219210i A0F() {
        Uri uri = this.A07;
        AnonymousClass124 anonymousClass124 = this.A0A;
        if (anonymousClass124 == null) {
            Activity activity = this.A0Q;
            anonymousClass124 = new AnonymousClass124(activity, C08M.A05(activity, activity.getString(R.string.app_name))) { // from class: X.1a9
                public final Context A00;
                public final AnonymousClass124 A01;

                {
                    C39411q5 c39411q5 = new C39411q5(r4);
                    this.A00 = activity.getApplicationContext();
                    this.A01 = c39411q5;
                }

                @Override // X.AnonymousClass124
                public InterfaceC06380Sv A6k() {
                    return new InterfaceC06380Sv(this.A00, this.A01.A6k()) { // from class: X.1a8
                        public InterfaceC06380Sv A00;
                        public InterfaceC06380Sv A01;
                        public InterfaceC06380Sv A02;
                        public InterfaceC06380Sv A03;
                        public InterfaceC06380Sv A04;
                        public InterfaceC06380Sv A05;
                        public InterfaceC06380Sv A06;
                        public final Context A07;
                        public final InterfaceC06380Sv A08;
                        public final List A09;

                        {
                            this.A07 = r2.getApplicationContext();
                            if (r3 != null) {
                                this.A08 = r3;
                                this.A09 = new ArrayList();
                                return;
                            }
                            throw null;
                        }

                        public final void A00(InterfaceC06380Sv interfaceC06380Sv) {
                            int i = 0;
                            while (true) {
                                List list = this.A09;
                                if (i >= list.size()) {
                                    return;
                                }
                                interfaceC06380Sv.A5K((C12L) list.get(i));
                                i++;
                            }
                        }

                        @Override // X.InterfaceC06380Sv
                        public void A5K(C12L c12l) {
                            this.A08.A5K(c12l);
                            this.A09.add(c12l);
                            InterfaceC06380Sv interfaceC06380Sv = this.A04;
                            if (interfaceC06380Sv != null) {
                                interfaceC06380Sv.A5K(c12l);
                            }
                            InterfaceC06380Sv interfaceC06380Sv2 = this.A00;
                            if (interfaceC06380Sv2 != null) {
                                interfaceC06380Sv2.A5K(c12l);
                            }
                            InterfaceC06380Sv interfaceC06380Sv3 = this.A01;
                            if (interfaceC06380Sv3 != null) {
                                interfaceC06380Sv3.A5K(c12l);
                            }
                            InterfaceC06380Sv interfaceC06380Sv4 = this.A06;
                            if (interfaceC06380Sv4 != null) {
                                interfaceC06380Sv4.A5K(c12l);
                            }
                            InterfaceC06380Sv interfaceC06380Sv5 = this.A02;
                            if (interfaceC06380Sv5 != null) {
                                interfaceC06380Sv5.A5K(c12l);
                            }
                            InterfaceC06380Sv interfaceC06380Sv6 = this.A05;
                            if (interfaceC06380Sv6 != null) {
                                interfaceC06380Sv6.A5K(c12l);
                            }
                        }

                        @Override // X.InterfaceC06380Sv
                        public Map ACr() {
                            InterfaceC06380Sv interfaceC06380Sv = this.A03;
                            return interfaceC06380Sv == null ? Collections.emptyMap() : interfaceC06380Sv.ACr();
                        }

                        @Override // X.InterfaceC06380Sv
                        public Uri ADi() {
                            InterfaceC06380Sv interfaceC06380Sv = this.A03;
                            if (interfaceC06380Sv == null) {
                                return null;
                            }
                            return interfaceC06380Sv.ADi();
                        }

                        @Override // X.InterfaceC06380Sv
                        public long AQX(AnonymousClass126 anonymousClass126) {
                            InterfaceC06380Sv interfaceC06380Sv;
                            C002701i.A1K(this.A03 == null);
                            Uri uri2 = anonymousClass126.A05;
                            String scheme = uri2.getScheme();
                            String scheme2 = uri2.getScheme();
                            if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
                                if ("asset".equals(scheme)) {
                                    if (this.A00 == null) {
                                        AbstractC30211a6 abstractC30211a6 = new AbstractC30211a6(this.A07) { // from class: X.1q1
                                            public long A00;
                                            public Uri A01;
                                            public InputStream A02;
                                            public boolean A03;
                                            public final AssetManager A04;

                                            {
                                                super(false);
                                                this.A04 = r2.getAssets();
                                            }

                                            @Override // X.InterfaceC06380Sv
                                            public Uri ADi() {
                                                return this.A01;
                                            }

                                            @Override // X.InterfaceC06380Sv
                                            public long AQX(AnonymousClass126 anonymousClass1262) {
                                                try {
                                                    Uri uri3 = anonymousClass1262.A05;
                                                    this.A01 = uri3;
                                                    String path = uri3.getPath();
                                                    if (path.startsWith("/android_asset/")) {
                                                        path = path.substring(15);
                                                    } else if (path.startsWith("/")) {
                                                        path = path.substring(1);
                                                    }
                                                    A01();
                                                    InputStream open = this.A04.open(path, 1);
                                                    this.A02 = open;
                                                    long j = anonymousClass1262.A04;
                                                    if (open.skip(j) >= j) {
                                                        long j2 = anonymousClass1262.A03;
                                                        if (j2 != -1) {
                                                            this.A00 = j2;
                                                        } else {
                                                            long available = this.A02.available();
                                                            this.A00 = available;
                                                            if (available == 2147483647L) {
                                                                this.A00 = -1L;
                                                            }
                                                        }
                                                        this.A03 = true;
                                                        A03(anonymousClass1262);
                                                        return this.A00;
                                                    }
                                                    throw new EOFException();
                                                } catch (IOException e) {
                                                    throw new AnonymousClass120(e);
                                                }
                                            }

                                            @Override // X.InterfaceC06380Sv
                                            public void close() {
                                                this.A01 = null;
                                                try {
                                                    try {
                                                        InputStream inputStream = this.A02;
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                    } catch (IOException e) {
                                                        throw new AnonymousClass120(e);
                                                    }
                                                } finally {
                                                    this.A02 = null;
                                                    if (this.A03) {
                                                        this.A03 = false;
                                                        A00();
                                                    }
                                                }
                                            }

                                            @Override // X.InterfaceC06380Sv
                                            public int read(byte[] bArr, int i, int i2) {
                                                if (i2 == 0) {
                                                    return 0;
                                                }
                                                long j = this.A00;
                                                if (j == 0) {
                                                    return -1;
                                                }
                                                if (j != -1) {
                                                    try {
                                                        i2 = (int) Math.min(j, i2);
                                                    } catch (IOException e) {
                                                        throw new AnonymousClass120(e);
                                                    }
                                                }
                                                int read = this.A02.read(bArr, i, i2);
                                                if (read == -1) {
                                                    if (this.A00 == -1) {
                                                        return -1;
                                                    }
                                                    throw new AnonymousClass120(new EOFException());
                                                }
                                                long j2 = this.A00;
                                                if (j2 != -1) {
                                                    this.A00 = j2 - read;
                                                }
                                                A02(read);
                                                return read;
                                            }
                                        };
                                        this.A00 = abstractC30211a6;
                                        A00(abstractC30211a6);
                                    }
                                    interfaceC06380Sv = this.A00;
                                    this.A03 = interfaceC06380Sv;
                                } else if ("content".equals(scheme)) {
                                    if (this.A01 == null) {
                                        C39381q2 c39381q2 = new C39381q2(this.A07);
                                        this.A01 = c39381q2;
                                        A00(c39381q2);
                                    }
                                    interfaceC06380Sv = this.A01;
                                    this.A03 = interfaceC06380Sv;
                                } else if ("rtmp".equals(scheme)) {
                                    interfaceC06380Sv = this.A06;
                                    if (interfaceC06380Sv == null) {
                                        try {
                                            InterfaceC06380Sv interfaceC06380Sv2 = (InterfaceC06380Sv) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                                            this.A06 = interfaceC06380Sv2;
                                            A00(interfaceC06380Sv2);
                                        } catch (ClassNotFoundException unused) {
                                            android.util.Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                                        } catch (Exception e) {
                                            throw new RuntimeException("Error instantiating RTMP extension", e);
                                        }
                                        interfaceC06380Sv = this.A06;
                                        if (interfaceC06380Sv == null) {
                                            interfaceC06380Sv = this.A08;
                                            this.A06 = interfaceC06380Sv;
                                        }
                                    }
                                    this.A03 = interfaceC06380Sv;
                                } else if ("data".equals(scheme)) {
                                    if (this.A02 == null) {
                                        AbstractC30211a6 abstractC30211a62 = new AbstractC30211a6() { // from class: X.1q3
                                            public int A00;
                                            public AnonymousClass126 A01;
                                            public byte[] A02;

                                            @Override // X.InterfaceC06380Sv
                                            public Uri ADi() {
                                                AnonymousClass126 anonymousClass1262 = this.A01;
                                                if (anonymousClass1262 != null) {
                                                    return anonymousClass1262.A05;
                                                }
                                                return null;
                                            }

                                            @Override // X.InterfaceC06380Sv
                                            public long AQX(AnonymousClass126 anonymousClass1262) {
                                                A01();
                                                this.A01 = anonymousClass1262;
                                                Uri uri3 = anonymousClass1262.A05;
                                                String scheme3 = uri3.getScheme();
                                                if ("data".equals(scheme3)) {
                                                    String[] split = uri3.getSchemeSpecificPart().split(",", -1);
                                                    if (split.length == 2) {
                                                        String str = split[1];
                                                        if (split[0].contains(";base64")) {
                                                            try {
                                                                this.A02 = Base64.decode(str, 0);
                                                            } catch (IllegalArgumentException e2) {
                                                                throw new C21100yn(C000200d.A0H("Error while parsing Base64 encoded string: ", str), e2);
                                                            }
                                                        } else {
                                                            this.A02 = URLDecoder.decode(str, "US-ASCII").getBytes(Charset.forName("UTF-8"));
                                                        }
                                                        A03(anonymousClass1262);
                                                        return this.A02.length;
                                                    }
                                                    throw new C21100yn(C000200d.A0G("Unexpected URI format: ", uri3));
                                                }
                                                throw new C21100yn(C000200d.A0H("Unsupported scheme: ", scheme3));
                                            }

                                            @Override // X.InterfaceC06380Sv
                                            public void close() {
                                                if (this.A02 != null) {
                                                    this.A02 = null;
                                                    A00();
                                                }
                                                this.A01 = null;
                                            }

                                            @Override // X.InterfaceC06380Sv
                                            public int read(byte[] bArr, int i, int i2) {
                                                if (i2 == 0) {
                                                    return 0;
                                                }
                                                byte[] bArr2 = this.A02;
                                                int length = bArr2.length;
                                                int i3 = this.A00;
                                                int i4 = length - i3;
                                                if (i4 == 0) {
                                                    return -1;
                                                }
                                                int min = Math.min(i2, i4);
                                                System.arraycopy(bArr2, i3, bArr, i, min);
                                                this.A00 += min;
                                                A02(min);
                                                return min;
                                            }
                                        };
                                        this.A02 = abstractC30211a62;
                                        A00(abstractC30211a62);
                                    }
                                    interfaceC06380Sv = this.A02;
                                    this.A03 = interfaceC06380Sv;
                                } else if ("rawresource".equals(scheme)) {
                                    if (this.A05 == null) {
                                        AbstractC30211a6 abstractC30211a63 = new AbstractC30211a6(this.A07) { // from class: X.1q7
                                            public long A00;
                                            public AssetFileDescriptor A01;
                                            public Uri A02;
                                            public InputStream A03;
                                            public boolean A04;
                                            public final Resources A05;

                                            {
                                                super(false);
                                                this.A05 = r2.getResources();
                                            }

                                            @Override // X.InterfaceC06380Sv
                                            public Uri ADi() {
                                                return this.A02;
                                            }

                                            @Override // X.InterfaceC06380Sv
                                            public long AQX(AnonymousClass126 anonymousClass1262) {
                                                try {
                                                    Uri uri3 = anonymousClass1262.A05;
                                                    this.A02 = uri3;
                                                    if (TextUtils.equals("rawresource", uri3.getScheme())) {
                                                        try {
                                                            int parseInt = Integer.parseInt(this.A02.getLastPathSegment());
                                                            A01();
                                                            AssetFileDescriptor openRawResourceFd = this.A05.openRawResourceFd(parseInt);
                                                            this.A01 = openRawResourceFd;
                                                            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                                                            this.A03 = fileInputStream;
                                                            fileInputStream.skip(this.A01.getStartOffset());
                                                            InputStream inputStream = this.A03;
                                                            long j = anonymousClass1262.A04;
                                                            if (inputStream.skip(j) >= j) {
                                                                long j2 = anonymousClass1262.A03;
                                                                if (j2 != -1) {
                                                                    this.A00 = j2;
                                                                } else {
                                                                    long length = this.A01.getLength();
                                                                    this.A00 = length != -1 ? length - j : -1L;
                                                                }
                                                                this.A04 = true;
                                                                A03(anonymousClass1262);
                                                                return this.A00;
                                                            }
                                                            throw new EOFException();
                                                        } catch (NumberFormatException unused2) {
                                                            throw new C12K("Resource identifier must be an integer.");
                                                        }
                                                    }
                                                    throw new C12K("URI must use scheme rawresource");
                                                } catch (IOException e2) {
                                                    throw new C12K(e2);
                                                }
                                            }

                                            @Override // X.InterfaceC06380Sv
                                            public void close() {
                                                this.A02 = null;
                                                try {
                                                    try {
                                                        InputStream inputStream = this.A03;
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        this.A03 = null;
                                                        try {
                                                            try {
                                                                AssetFileDescriptor assetFileDescriptor = this.A01;
                                                                if (assetFileDescriptor != null) {
                                                                    assetFileDescriptor.close();
                                                                }
                                                            } catch (IOException e2) {
                                                                throw new C12K(e2);
                                                            }
                                                        } finally {
                                                            this.A01 = null;
                                                            if (this.A04) {
                                                                this.A04 = false;
                                                                A00();
                                                            }
                                                        }
                                                    } catch (Throwable th) {
                                                        this.A03 = null;
                                                        try {
                                                            try {
                                                                AssetFileDescriptor assetFileDescriptor2 = this.A01;
                                                                if (assetFileDescriptor2 != null) {
                                                                    assetFileDescriptor2.close();
                                                                }
                                                                this.A01 = null;
                                                                if (this.A04) {
                                                                    this.A04 = false;
                                                                    A00();
                                                                }
                                                                throw th;
                                                            } catch (IOException e3) {
                                                                throw new C12K(e3);
                                                            }
                                                        } finally {
                                                            this.A01 = null;
                                                            if (this.A04) {
                                                                this.A04 = false;
                                                                A00();
                                                            }
                                                        }
                                                    }
                                                } catch (IOException e4) {
                                                    throw new C12K(e4);
                                                }
                                            }

                                            @Override // X.InterfaceC06380Sv
                                            public int read(byte[] bArr, int i, int i2) {
                                                if (i2 == 0) {
                                                    return 0;
                                                }
                                                long j = this.A00;
                                                if (j == 0) {
                                                    return -1;
                                                }
                                                if (j != -1) {
                                                    try {
                                                        i2 = (int) Math.min(j, i2);
                                                    } catch (IOException e2) {
                                                        throw new C12K(e2);
                                                    }
                                                }
                                                int read = this.A03.read(bArr, i, i2);
                                                if (read == -1) {
                                                    if (this.A00 == -1) {
                                                        return -1;
                                                    }
                                                    throw new C12K(new EOFException());
                                                }
                                                long j2 = this.A00;
                                                if (j2 != -1) {
                                                    this.A00 = j2 - read;
                                                }
                                                A02(read);
                                                return read;
                                            }
                                        };
                                        this.A05 = abstractC30211a63;
                                        A00(abstractC30211a63);
                                    }
                                    interfaceC06380Sv = this.A05;
                                    this.A03 = interfaceC06380Sv;
                                } else {
                                    interfaceC06380Sv = this.A08;
                                    this.A03 = interfaceC06380Sv;
                                }
                            } else if (uri2.getPath().startsWith("/android_asset/")) {
                                if (this.A00 == null) {
                                    AbstractC30211a6 abstractC30211a64 = new AbstractC30211a6(this.A07) { // from class: X.1q1
                                        public long A00;
                                        public Uri A01;
                                        public InputStream A02;
                                        public boolean A03;
                                        public final AssetManager A04;

                                        {
                                            super(false);
                                            this.A04 = r2.getAssets();
                                        }

                                        @Override // X.InterfaceC06380Sv
                                        public Uri ADi() {
                                            return this.A01;
                                        }

                                        @Override // X.InterfaceC06380Sv
                                        public long AQX(AnonymousClass126 anonymousClass1262) {
                                            try {
                                                Uri uri3 = anonymousClass1262.A05;
                                                this.A01 = uri3;
                                                String path = uri3.getPath();
                                                if (path.startsWith("/android_asset/")) {
                                                    path = path.substring(15);
                                                } else if (path.startsWith("/")) {
                                                    path = path.substring(1);
                                                }
                                                A01();
                                                InputStream open = this.A04.open(path, 1);
                                                this.A02 = open;
                                                long j = anonymousClass1262.A04;
                                                if (open.skip(j) >= j) {
                                                    long j2 = anonymousClass1262.A03;
                                                    if (j2 != -1) {
                                                        this.A00 = j2;
                                                    } else {
                                                        long available = this.A02.available();
                                                        this.A00 = available;
                                                        if (available == 2147483647L) {
                                                            this.A00 = -1L;
                                                        }
                                                    }
                                                    this.A03 = true;
                                                    A03(anonymousClass1262);
                                                    return this.A00;
                                                }
                                                throw new EOFException();
                                            } catch (IOException e2) {
                                                throw new AnonymousClass120(e2);
                                            }
                                        }

                                        @Override // X.InterfaceC06380Sv
                                        public void close() {
                                            this.A01 = null;
                                            try {
                                                try {
                                                    InputStream inputStream = this.A02;
                                                    if (inputStream != null) {
                                                        inputStream.close();
                                                    }
                                                } catch (IOException e2) {
                                                    throw new AnonymousClass120(e2);
                                                }
                                            } finally {
                                                this.A02 = null;
                                                if (this.A03) {
                                                    this.A03 = false;
                                                    A00();
                                                }
                                            }
                                        }

                                        @Override // X.InterfaceC06380Sv
                                        public int read(byte[] bArr, int i, int i2) {
                                            if (i2 == 0) {
                                                return 0;
                                            }
                                            long j = this.A00;
                                            if (j == 0) {
                                                return -1;
                                            }
                                            if (j != -1) {
                                                try {
                                                    i2 = (int) Math.min(j, i2);
                                                } catch (IOException e2) {
                                                    throw new AnonymousClass120(e2);
                                                }
                                            }
                                            int read = this.A02.read(bArr, i, i2);
                                            if (read == -1) {
                                                if (this.A00 == -1) {
                                                    return -1;
                                                }
                                                throw new AnonymousClass120(new EOFException());
                                            }
                                            long j2 = this.A00;
                                            if (j2 != -1) {
                                                this.A00 = j2 - read;
                                            }
                                            A02(read);
                                            return read;
                                        }
                                    };
                                    this.A00 = abstractC30211a64;
                                    A00(abstractC30211a64);
                                }
                                interfaceC06380Sv = this.A00;
                                this.A03 = interfaceC06380Sv;
                            } else {
                                if (this.A04 == null) {
                                    C39421q6 c39421q6 = new C39421q6();
                                    this.A04 = c39421q6;
                                    A00(c39421q6);
                                }
                                interfaceC06380Sv = this.A04;
                                this.A03 = interfaceC06380Sv;
                            }
                            return interfaceC06380Sv.AQX(anonymousClass126);
                        }

                        @Override // X.InterfaceC06380Sv
                        public void close() {
                            InterfaceC06380Sv interfaceC06380Sv = this.A03;
                            if (interfaceC06380Sv != null) {
                                try {
                                    interfaceC06380Sv.close();
                                } finally {
                                    this.A03 = null;
                                }
                            }
                        }

                        @Override // X.InterfaceC06380Sv
                        public int read(byte[] bArr, int i, int i2) {
                            InterfaceC06380Sv interfaceC06380Sv = this.A03;
                            if (interfaceC06380Sv != null) {
                                return interfaceC06380Sv.read(bArr, i, i2);
                            }
                            throw null;
                        }
                    };
                }
            };
            this.A0A = anonymousClass124;
        }
        C39281ps c39281ps = new C39281ps(uri, anonymousClass124, C1ZV.A0J);
        return this.A0I ? new C24561Bz(c39281ps, this.A00) : c39281ps;
    }

    public void A0G() {
        C38O c38o = this.A0B;
        if (c38o != null) {
            c38o.A00.A0q();
            c38o.A00.A0r(false);
        }
    }

    public void A0H() {
        hashCode();
        if (this.A08 != null) {
            return;
        }
        ExoPlaybackControlView exoPlaybackControlView = this.A0C;
        if (exoPlaybackControlView != null) {
            if ((this.A0Q.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) {
                exoPlaybackControlView.A0B.setVisibility(0);
                if (exoPlaybackControlView.A07) {
                    exoPlaybackControlView.A0A.setVisibility(0);
                }
                exoPlaybackControlView.A04();
                exoPlaybackControlView.A03();
                exoPlaybackControlView.A05();
            } else {
                exoPlaybackControlView.A02();
            }
        }
        A0J();
        this.A0G = true;
        if (this.A0O) {
            C06260Si c06260Si = this.A08;
            if (c06260Si != null) {
                c06260Si.ATc(true);
                ExoPlaybackControlView exoPlaybackControlView2 = this.A0C;
                if (exoPlaybackControlView2 != null) {
                    exoPlaybackControlView2.A03 = null;
                    exoPlaybackControlView2.A04 = new InterfaceC72933ap() { // from class: X.3sg
                        {
                            C48652Gd.this = this;
                        }

                        @Override // X.InterfaceC72933ap
                        public final void AOw() {
                            C48652Gd.this.A02++;
                        }
                    };
                }
                C018508q c018508q = this.A0T;
                c018508q.A02.post(new RunnableEBaseShape7S0100000_I0_7(this, 30));
            }
        } else if (this.A0C == null) {
            AbstractC73093b5 abstractC73093b5 = this.A0D;
            if (abstractC73093b5 != null) {
                abstractC73093b5.A00();
            }
            this.A08.A07(A0F(), true, true);
        } else {
            C06260Si c06260Si2 = this.A08;
            if (c06260Si2 != null) {
                c06260Si2.ATc(false);
                ExoPlaybackControlView exoPlaybackControlView3 = this.A0C;
                if (exoPlaybackControlView3 == null) {
                    return;
                }
                exoPlaybackControlView3.A03 = new InterfaceC72923ao() { // from class: X.3se
                    {
                        C48652Gd.this = this;
                    }

                    @Override // X.InterfaceC72923ao
                    public final void AIT() {
                        C48652Gd c48652Gd = C48652Gd.this;
                        c48652Gd.A0L(c48652Gd.A0F());
                    }
                };
                exoPlaybackControlView3.A04 = new InterfaceC72933ap() { // from class: X.3sf
                    {
                        C48652Gd.this = this;
                    }

                    @Override // X.InterfaceC72933ap
                    public final void AOw() {
                        C48652Gd c48652Gd = C48652Gd.this;
                        c48652Gd.A0L(c48652Gd.A0F());
                    }
                };
                return;
            }
            throw null;
        }
    }

    public void A0I() {
        C06260Si c06260Si = this.A08;
        if (c06260Si != null) {
            if (c06260Si != null && c06260Si.ACT() != 1) {
                this.A0M = true;
                this.A08.A00();
            } else {
                this.A0M = false;
            }
            this.A0N = false;
            this.A0E = false;
            this.A0L = false;
            this.A0K = false;
            AbstractC73093b5 abstractC73093b5 = this.A0D;
            if (abstractC73093b5 != null) {
                abstractC73093b5.A00();
            }
            this.A08.A07(A0F(), true, true);
            this.A0G = true;
        }
    }

    public final void A0J() {
        C86593xt c86593xt;
        int i;
        C06260Si A00;
        boolean z;
        if (this.A08 == null) {
            this.A09 = new C39351pz(new InterfaceC221911j() { // from class: X.1a1
                @Override // X.InterfaceC221911j
                public InterfaceC222011k A6z(C220710x c220710x, AnonymousClass122 anonymousClass122, int[] iArr) {
                    C002701i.A1J(iArr.length == 1);
                    return new C39361q0(c220710x, iArr[0]);
                }
            });
            C83943sw c83943sw = this.A0W;
            if (c83943sw != null) {
                c86593xt = this.A0X;
                Context context = c86593xt.getContext();
                C39351pz c39351pz = this.A09;
                C72963as c72963as = c83943sw.A00;
                int i2 = c72963as.A00;
                if (i2 < C72963as.A08) {
                    c72963as.A00 = i2 + 1;
                    z = true;
                } else {
                    z = false;
                }
                i = -1;
                A00 = C20940yX.A00(context, new C84073t9(context, z), c39351pz, new C1Z4(new AnonymousClass127(), 700, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, 100, 100));
                this.A08 = A00;
            } else {
                c86593xt = this.A0X;
                i = -1;
                A00 = C20940yX.A00(c86593xt.getContext(), new InterfaceC21190yw(c86593xt.getContext()) { // from class: X.3sr
                    public final Context A00;

                    {
                        this.A00 = r1;
                    }

                    @Override // X.InterfaceC21190yw
                    public C1Z6[] A6v(Handler handler, AnonymousClass137 anonymousClass137, InterfaceC21440zL interfaceC21440zL, AnonymousClass117 anonymousClass117, C10M c10m, InterfaceC21720zn interfaceC21720zn) {
                        ArrayList arrayList = new ArrayList();
                        Context context2 = this.A00;
                        C10C c10c = C10C.A00;
                        arrayList.add(new C19580vf(context2, c10c, interfaceC21720zn, handler, anonymousClass137));
                        arrayList.add(new C19790w4(context2, c10c, interfaceC21720zn, handler, interfaceC21440zL, C21360zD.A00(context2), new InterfaceC21420zJ[0]));
                        arrayList.add(new C24441Av(anonymousClass117, handler.getLooper()));
                        return (C1Z6[]) arrayList.toArray(new C1Z6[0]);
                    }
                }, this.A09, new C1Z4(new AnonymousClass127(), SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, 2000, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                this.A08 = A00;
            }
            A00.A04(this.A0J ? 0.0f : 1.0f);
            this.A08.A5D(this.A0S);
            c86593xt.setPlayer(this.A08);
            if (this.A0P) {
                long j = this.A05;
                if (j == -9223372036854775807L) {
                    this.A08.ASI(this.A01, -9223372036854775807L);
                    return;
                } else {
                    this.A08.ASI(this.A01, j);
                    return;
                }
            }
            int i3 = this.A03;
            if (i3 < 0) {
                return;
            }
            this.A08.ASJ(i3);
            this.A03 = i;
        }
    }

    public final void A0K() {
        AudioManager A0A;
        if (this.A0F || (A0A = this.A0U.A0A()) == null) {
            return;
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A06;
        if (onAudioFocusChangeListener == null) {
            onAudioFocusChangeListener = C72783aa.A00;
            this.A06 = onAudioFocusChangeListener;
        }
        A0A.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
    }

    public final void A0L(InterfaceC219210i interfaceC219210i) {
        ExoPlaybackControlView exoPlaybackControlView = this.A0C;
        if (exoPlaybackControlView != null) {
            exoPlaybackControlView.A03 = null;
            exoPlaybackControlView.A04 = null;
        }
        A0J();
        AbstractC73093b5 abstractC73093b5 = this.A0D;
        if (abstractC73093b5 != null) {
            abstractC73093b5.A00();
        }
        C06260Si c06260Si = this.A08;
        if (c06260Si != null && c06260Si.ACT() == 1) {
            this.A08.A07(interfaceC219210i, true, true);
        }
        A0K();
    }

    public void A0M(String str, boolean z) {
        C000200d.A13("ExoPlayerVideoPlayer/onError=", str);
        InterfaceC73123b8 interfaceC73123b8 = super.A02;
        if (interfaceC73123b8 != null) {
            interfaceC73123b8.AJy(str, z);
        }
        AbstractC73093b5 abstractC73093b5 = this.A0D;
        if (abstractC73093b5 != null && !(abstractC73093b5 instanceof C84103tC)) {
            ((C67393Fi) abstractC73093b5).A0A.A00();
        }
    }
}
