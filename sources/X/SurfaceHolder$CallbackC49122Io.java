package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Io */
/* loaded from: classes2.dex */
public class SurfaceHolder$CallbackC49122Io extends AbstractC49142Ir implements InterfaceC471629w, SurfaceHolder.Callback {
    public int A00;
    public int A01;
    public int A02;
    public SurfaceTexture A03;
    public Camera.Size A04;
    public Camera.Size A05;
    public Camera.Size A06;
    public Camera A07;
    public MediaRecorder A08;
    public Handler A09;
    public HandlerThread A0A;
    public Display A0B;
    public SurfaceHolder A0C;
    public C17370rz A0D;
    public C17390s1 A0E;
    public C1WJ A0F;
    public C1WJ A0G;
    public InterfaceC49112In A0H;
    public C2oa A0I;
    public C02F A0J;
    public C2F8 A0K;
    public C02O A0L;
    public String A0M;
    public List A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final Handler A0U;
    public final AnonymousClass355 A0V;
    public final C57202or A0W;
    public final float[] A0X;
    public volatile byte[] A0Y;
    public static final String[] A0a = {"GT-I9505", "GT-I9506", "GT-I9505G", "SGH-I337", "SGH-M919", "SCH-I545", "SPH-L720", "SCH-R970", "GT-I9508", "SGH-N045", "SC-04E"};
    public static final String[] A0Z = {"GT-I9195", "GT-I9190", "GT-I9192"};

    public static int A00(float f) {
        if (f < -995.0f) {
            f = -995.0f;
        } else if (f > 995.0f) {
            f = 995.0f;
        }
        return (int) f;
    }

    @Override // X.InterfaceC471629w
    public void ARs() {
    }

    @Override // X.InterfaceC471629w
    public int getCameraApi() {
        return 0;
    }

    @Override // X.InterfaceC471629w
    public int getCameraType() {
        return 0;
    }

    @Override // X.InterfaceC471629w
    public void pause() {
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.2oa] */
    public SurfaceHolder$CallbackC49122Io(Context context) {
        super(context);
        this.A0U = new Handler(Looper.getMainLooper());
        this.A0X = new float[16];
        this.A0V = new AnonymousClass355(this);
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.A00 = sharedPreferences.getInt("camera_index", 0);
        this.A0M = sharedPreferences.getString("flash_mode", null);
        SurfaceHolder holder = getHolder();
        this.A0C = holder;
        holder.addCallback(this);
        this.A0C.setType(3);
        this.A0B = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.A0I = new OrientationEventListener(context) { // from class: X.2oa
            public int A00;

            {
                SurfaceHolder$CallbackC49122Io.this = this;
                this.A00 = this.A0B.getRotation();
            }

            @Override // android.view.OrientationEventListener
            public void enable() {
                super.enable();
                this.A00 = SurfaceHolder$CallbackC49122Io.this.A0B.getRotation();
            }

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i) {
                int i2;
                SurfaceHolder$CallbackC49122Io surfaceHolder$CallbackC49122Io = SurfaceHolder$CallbackC49122Io.this;
                int rotation = surfaceHolder$CallbackC49122Io.A0B.getRotation();
                if (rotation != -1 && rotation != (i2 = this.A00) && Math.abs(i2 - rotation) % 2 == 0) {
                    surfaceHolder$CallbackC49122Io.surfaceChanged(surfaceHolder$CallbackC49122Io.A0C, 0, 0, 0);
                }
                this.A00 = rotation;
            }
        };
        this.A0W = new C57202or(this.A0V, new InterfaceC57182op() { // from class: X.34v
            {
                SurfaceHolder$CallbackC49122Io.this = this;
            }

            @Override // X.InterfaceC57182op
            public final void AMP(C1D9 c1d9) {
                InterfaceC49112In interfaceC49112In = SurfaceHolder$CallbackC49122Io.this.A0H;
                if (interfaceC49112In != null) {
                    interfaceC49112In.ANU(c1d9);
                }
            }
        });
    }

    public static Camera.Size A01(List list, int i, int i2) {
        double d = i;
        double d2 = d / i2;
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size2 = (Camera.Size) it.next();
            int i3 = size2.width;
            double d3 = i3;
            int i4 = size2.height;
            double d4 = d3 / i4;
            double d5 = d3 / d;
            if (i3 * i4 >= 153600 && d5 <= 1.5d && Math.abs(d4 - d2) <= 0.1d && A03(size2, size, i, i2)) {
                size = size2;
            }
        }
        if (size == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Camera.Size size3 = (Camera.Size) it2.next();
                if (size3.width / d <= 1.5d && A03(size3, size, i, i2)) {
                    size = size3;
                }
            }
            if (size == null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Camera.Size size4 = (Camera.Size) it3.next();
                    if (A03(size4, size, i, i2)) {
                        size = size4;
                    }
                }
            }
        }
        return size;
    }

    public static String A02(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size = (Camera.Size) it.next();
            sb.append(size.width);
            sb.append('x');
            sb.append(size.height);
            sb.append(", ");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
        }
        return sb.toString();
    }

    public static boolean A03(Camera.Size size, Camera.Size size2, int i, int i2) {
        if (size2 == null) {
            return true;
        }
        int abs = Math.abs(size2.height - i2);
        return (Math.abs(size.width - i) * i2) + (Math.abs(size.height - i2) * i) < (Math.abs(size2.width - i) * i2) + (abs * i);
    }

    public final void A04() {
        MediaRecorder mediaRecorder = this.A08;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.A08.release();
            this.A08 = null;
            this.A0R = false;
            Camera camera = this.A07;
            if (camera != null) {
                try {
                    camera.lock();
                    Camera.Parameters parameters = this.A07.getParameters();
                    parameters.getFlashMode();
                    if ("torch".equals(parameters.getFlashMode())) {
                        parameters.setFlashMode("off");
                        this.A07.setParameters(parameters);
                        this.A07.stopPreview();
                        this.A0O = false;
                    }
                } catch (RuntimeException e) {
                    Log.e("failed to lock the camera, it's in use by another process or WhatsApp video call.", e);
                }
            }
        }
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A03 = null;
        }
        C1WJ c1wj = this.A0F;
        if (c1wj != null) {
            c1wj.A02();
            this.A0F = null;
        }
        C17390s1 c17390s1 = this.A0E;
        if (c17390s1 != null) {
            if (c17390s1.A00 != null) {
                c17390s1.A00 = null;
            }
            this.A0E = null;
        }
        C1WJ c1wj2 = this.A0G;
        if (c1wj2 != null) {
            c1wj2.A02();
            this.A0G = null;
        }
        C17370rz c17370rz = this.A0D;
        if (c17370rz != null) {
            c17370rz.A01();
            this.A0D = null;
        }
    }

    public final synchronized void A05() {
        Camera camera = this.A07;
        if (camera == null) {
            try {
                if (this.A00 >= Camera.getNumberOfCameras()) {
                    this.A00 = Camera.getNumberOfCameras() - 1;
                }
                Camera open = Camera.open(this.A00);
                this.A07 = open;
                open.setErrorCallback(new Camera.ErrorCallback() { // from class: X.2oQ
                    {
                        SurfaceHolder$CallbackC49122Io.this = this;
                    }

                    @Override // android.hardware.Camera.ErrorCallback
                    public final void onError(int i, Camera camera2) {
                        SurfaceHolder$CallbackC49122Io surfaceHolder$CallbackC49122Io = SurfaceHolder$CallbackC49122Io.this;
                        synchronized (surfaceHolder$CallbackC49122Io) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("cameraview/start-camera camera error:");
                            sb.append(i);
                            sb.append(" takingpicture:");
                            sb.append(surfaceHolder$CallbackC49122Io.A0T);
                            sb.append(" recording:");
                            sb.append(surfaceHolder$CallbackC49122Io.A0R);
                            sb.append(" inpreview:");
                            sb.append(surfaceHolder$CallbackC49122Io.A0O);
                            Log.w(sb.toString());
                            if (i == 100) {
                                surfaceHolder$CallbackC49122Io.A07();
                                surfaceHolder$CallbackC49122Io.A09.post(new RunnableEBaseShape1S0100000_I0_1(surfaceHolder$CallbackC49122Io, 3));
                            } else if (i == 2) {
                                Camera camera3 = surfaceHolder$CallbackC49122Io.A07;
                                if (camera3 != null) {
                                    camera3.release();
                                }
                                surfaceHolder$CallbackC49122Io.A07 = null;
                                surfaceHolder$CallbackC49122Io.A08(i);
                            }
                        }
                    }
                });
            } catch (Exception e) {
                Camera camera2 = this.A07;
                if (camera2 != null) {
                    camera2.release();
                }
                this.A07 = null;
                Log.e("cameraview/start-camera error opening camera", e);
                if (this.A00 != 0) {
                    getSharedPreferences().edit().putInt("camera_index", 0).apply();
                }
                A08(1);
            }
            Camera camera3 = this.A07;
            if (camera3 != null) {
                try {
                    camera3.setPreviewDisplay(this.A0C);
                    A06();
                } catch (IOException | RuntimeException e2) {
                    this.A07.release();
                    this.A07 = null;
                    Log.e("cameraview/start-camera", e2);
                    if (this.A00 != 0) {
                        getSharedPreferences().edit().putInt("camera_index", 0).apply();
                    }
                    A08(1);
                }
            }
        } else {
            try {
                camera.reconnect();
            } catch (IOException e3) {
                this.A07.release();
                this.A07 = null;
                Log.e("cameraview/start-camera error reconnecting camera", e3);
                A08(1);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:39|(25:41|(2:43|(1:45)(1:147))(1:148)|47|(1:49)(1:146)|50|51|52|53|(2:55|(15:57|58|(2:60|(2:62|(1:64)(2:65|(1:67))))(2:138|(1:140))|68|(3:70|(4:73|(1:121)(3:75|76|(2:111|(3:113|114|(2:116|117)(1:119))(1:120))(1:81))|118|71)|122)(3:123|(4:126|(3:131|132|133)|134|124)|137)|82|(2:88|(1:90)(1:91))|92|(1:110)(3:96|(1:109)|100)|101|(1:103)|104|(1:106)|107|108))(1:142)|141|58|(0)(0)|68|(0)(0)|82|(4:84|86|88|(0)(0))|92|(1:94)|110|101|(0)|104|(0)|107|108)|149|47|(0)(0)|50|51|52|53|(0)(0)|141|58|(0)(0)|68|(0)(0)|82|(0)|92|(0)|110|101|(0)|104|(0)|107|108) */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0041, code lost:
        if (r9 == 2) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x015e, code lost:
        if (r9 != 3) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x01c1, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01c2, code lost:
        com.whatsapp.util.Log.e("cameraview/start-preview/setdisplayorientation ", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x016b A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01b0 A[Catch: all -> 0x040c, TRY_LEAVE, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01d8 A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0203 A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x020f A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0286 A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02b3 A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02e8 A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0310 A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0344 A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x038a A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03de A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03f7 A[Catch: all -> 0x040c, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0405 A[Catch: all -> 0x040c, TRY_LEAVE, TryCatch #1 {, blocks: (B:158:0x0004, B:160:0x002d, B:163:0x0037, B:168:0x0044, B:170:0x0052, B:171:0x0058, B:174:0x0060, B:176:0x006a, B:177:0x0070, B:180:0x00ba, B:182:0x00c6, B:184:0x00d8, B:186:0x00e3, B:188:0x00f5, B:190:0x0106, B:193:0x014f, B:204:0x0167, B:206:0x016b, B:207:0x0177, B:209:0x01b9, B:212:0x01c7, B:214:0x01d8, B:216:0x01fc, B:219:0x0209, B:221:0x020f, B:223:0x0237, B:225:0x023f, B:273:0x03ca, B:275:0x03d6, B:226:0x025a, B:228:0x0286, B:229:0x029b, B:231:0x02a1, B:244:0x02d8, B:268:0x03ac, B:270:0x03bc, B:246:0x02e4, B:248:0x02e8, B:250:0x02f2, B:252:0x02fc, B:254:0x0310, B:267:0x038a, B:255:0x0319, B:257:0x0344, B:259:0x0348, B:261:0x0369, B:264:0x0372, B:265:0x0379, B:280:0x03f7, B:281:0x03fe, B:283:0x0405, B:263:0x036e, B:266:0x037f, B:236:0x02b3, B:237:0x02b7, B:239:0x02bd, B:241:0x02cc, B:243:0x02d3, B:276:0x03de, B:278:0x03ef, B:217:0x0203, B:211:0x01c2, B:208:0x01b0), top: B:291:0x0004, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A06() {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolder$CallbackC49122Io.A06():void");
    }

    public final synchronized void A07() {
        Log.i("cameraview/stop-camera");
        Camera camera = this.A07;
        if (camera != null) {
            try {
                camera.stopPreview();
                this.A0O = false;
            } catch (Exception e) {
                Log.w("cameraview/stop-camera error stopping camera preview", e);
            }
            try {
                this.A07.release();
            } catch (Exception e2) {
                Log.w("cameraview/stop-camera error releasing camera", e2);
            }
            this.A07 = null;
        }
        Log.i("cameraview/stop-camera-end");
    }

    public final void A08(int i) {
        C000200d.A0q("cameraview/on-error ", i);
        InterfaceC49112In interfaceC49112In = this.A0H;
        if (interfaceC49112In != null) {
            interfaceC49112In.AI9(i != 2 ? 1 : 2);
        }
    }

    @Override // X.InterfaceC471629w
    public void A6C() {
        this.A0W.A00();
    }

    @Override // X.InterfaceC471629w
    public void A7u(float f, float f2) {
        this.A09.post(new RunnableEBaseShape0S0100002_I0(this, f, f2, 1));
    }

    @Override // X.InterfaceC471629w
    public boolean AFI() {
        return this.A0P;
    }

    @Override // X.InterfaceC471629w
    public boolean AFK() {
        return this.A0O;
    }

    @Override // X.InterfaceC471629w
    public boolean AFg() {
        return this.A0R;
    }

    @Override // X.InterfaceC471629w
    public boolean AFr() {
        Camera camera = this.A07;
        if (camera == null || !this.A0S) {
            return false;
        }
        return "torch".equals(camera.getParameters().getFlashMode());
    }

    @Override // X.InterfaceC471629w
    public boolean AGa() {
        Camera camera;
        if (this.A0P && "on".equals(this.A0M) && (camera = this.A07) != null) {
            List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
            return supportedFlashModes == null || !supportedFlashModes.contains(this.A0M);
        }
        return false;
    }

    @Override // X.InterfaceC471629w
    public synchronized void AGk() {
        Log.i("cameraview/next-camera");
        if (this.A07 != null) {
            if (Camera.getNumberOfCameras() > 1) {
                this.A00 = (this.A00 + 1) % Camera.getNumberOfCameras();
                this.A0P = getCameraInfo().facing == 1;
                A07();
                this.A09.post(new RunnableEBaseShape1S0100000_I0_1(this, 3));
                getSharedPreferences().edit().putInt("camera_index", this.A00).apply();
            }
        }
    }

    @Override // X.InterfaceC471629w
    public synchronized String AGl() {
        if (this.A07 == null) {
            return null;
        }
        List flashModes = getFlashModes();
        if (flashModes.isEmpty()) {
            return null;
        }
        Camera.Parameters parameters = this.A07.getParameters();
        String str = this.A0M;
        if (str == null) {
            str = parameters.getFlashMode();
            this.A0M = str;
        }
        int indexOf = flashModes.indexOf(str);
        if (indexOf >= 0 || (indexOf = flashModes.indexOf("off")) >= 0) {
            String str2 = (String) flashModes.get((indexOf + 1) % flashModes.size());
            this.A0M = str2;
            StringBuilder sb = new StringBuilder();
            sb.append("cameraview/next flash mode:");
            sb.append(str2);
            Log.i(sb.toString());
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains(this.A0M)) {
                parameters.setFlashMode(this.A0M);
                this.A07.setParameters(parameters);
            }
            getSharedPreferences().edit().putString("flash_mode", this.A0M).apply();
            return this.A0M;
        }
        return null;
    }

    @Override // X.InterfaceC471629w
    public void ARq() {
        this.A09.post(new RunnableEBaseShape0S0200000_I0_0(this, this.A0C, 33));
    }

    @Override // X.InterfaceC471629w
    public synchronized int AUG(int i) {
        Camera camera = this.A07;
        if (camera == null) {
            return 0;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (!parameters.isZoomSupported() || i > parameters.getMaxZoom()) {
            return 0;
        }
        if (parameters.getZoom() != i) {
            parameters.setZoom(i);
            this.A07.setParameters(parameters);
        }
        List<Integer> zoomRatios = parameters.getZoomRatios();
        if (zoomRatios == null || zoomRatios.size() < i) {
            return 0;
        }
        return zoomRatios.get(i).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:376:0x02e0 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0332 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0347 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0367 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x037f A[Catch: all -> 0x057d, TRY_LEAVE, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x03a9 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x03c5 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x03d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0442 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0456 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x047b A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0489 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x04af A[Catch: all -> 0x057d, TRY_LEAVE, TryCatch #5 {all -> 0x057d, blocks: (B:268:0x0003, B:270:0x0027, B:276:0x0045, B:466:0x054f, B:468:0x055f, B:471:0x0570, B:470:0x0564, B:277:0x004c, B:279:0x009f, B:280:0x00a3, B:283:0x00ab, B:285:0x00b1, B:286:0x00b9, B:288:0x00c2, B:290:0x00db, B:293:0x00e5, B:294:0x0126, B:296:0x012c, B:300:0x013c, B:305:0x0147, B:307:0x0150, B:308:0x0153, B:310:0x0163, B:313:0x016f, B:315:0x0173, B:316:0x017a, B:317:0x017e, B:319:0x0184, B:321:0x0192, B:323:0x019a, B:328:0x01a5, B:330:0x01af, B:332:0x01b9, B:374:0x0296, B:376:0x02e0, B:378:0x0300, B:379:0x0303, B:387:0x0343, B:389:0x0347, B:390:0x035d, B:392:0x0367, B:394:0x036d, B:396:0x0375, B:397:0x0378, B:399:0x037f, B:400:0x0384, B:403:0x0392, B:402:0x038d, B:404:0x039d, B:406:0x03a9, B:410:0x03b1, B:412:0x03bb, B:414:0x03c5, B:422:0x03d9, B:424:0x03e1, B:425:0x03e7, B:427:0x03f5, B:428:0x03fa, B:438:0x0471, B:440:0x047b, B:442:0x047f, B:443:0x0483, B:446:0x04b3, B:449:0x04bc, B:450:0x04c1, B:453:0x04ce, B:454:0x051c, B:457:0x052a, B:456:0x0525, B:452:0x04c9, B:460:0x0532, B:462:0x053f, B:429:0x0404, B:430:0x042a, B:431:0x042e, B:433:0x0442, B:434:0x0448, B:436:0x0456, B:437:0x045b, B:444:0x0489, B:445:0x04af, B:380:0x0326, B:382:0x032e, B:383:0x0332, B:333:0x01d1, B:335:0x01d5, B:337:0x01df, B:339:0x01e9, B:342:0x0201, B:343:0x0213, B:345:0x0219, B:347:0x0227, B:349:0x022d, B:351:0x0231, B:353:0x0236, B:357:0x024c, B:358:0x0255, B:360:0x025b, B:362:0x0269, B:364:0x026e, B:368:0x0284, B:370:0x028b, B:292:0x00e1, B:312:0x0168, B:271:0x002e, B:273:0x0036, B:274:0x003d), top: B:485:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x04ba A[ADDED_TO_REGION] */
    @Override // X.InterfaceC471629w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void AV4(java.io.File r25, int r26) {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolder$CallbackC49122Io.AV4(java.io.File, int):void");
    }

    @Override // X.InterfaceC471629w
    public synchronized void AVD() {
        try {
            this.A08.stop();
        } catch (RuntimeException e) {
            Log.w("cameraview/stop-video-capture ", e);
        }
        A04();
        Camera camera = this.A07;
        if (camera != null) {
            camera.lock();
        }
        this.A0R = false;
        this.A05 = null;
    }

    @Override // X.InterfaceC471629w
    public boolean AVK() {
        return this.A0S;
    }

    @Override // X.InterfaceC471629w
    public synchronized void AVO(final C471729x c471729x, boolean z) {
        if (this.A07 == null) {
            Log.e("cameraview/take-picture camera is null");
            A08(1);
        } else if (this.A0T) {
            Log.e("cameraview/take-picture already taking a picture");
        } else {
            this.A0O = false;
            this.A0T = true;
            Log.i("cameraview/take-picture/start");
            Camera.Parameters parameters = this.A07.getParameters();
            parameters.setRotation(getRequiredCameraRotation());
            parameters.setJpegQuality(80);
            this.A07.setParameters(parameters);
            try {
                Camera.PictureCallback pictureCallback = new Camera.PictureCallback() { // from class: X.2oP
                    {
                        SurfaceHolder$CallbackC49122Io.this = this;
                    }

                    @Override // android.hardware.Camera.PictureCallback
                    public final void onPictureTaken(byte[] bArr, Camera camera) {
                        SurfaceHolder$CallbackC49122Io surfaceHolder$CallbackC49122Io = SurfaceHolder$CallbackC49122Io.this;
                        C471729x c471729x2 = c471729x;
                        C000200d.A1V(C000200d.A0P("cameraview/take-picture taken "), surfaceHolder$CallbackC49122Io.A0P);
                        try {
                            surfaceHolder$CallbackC49122Io.A07.stopPreview();
                            surfaceHolder$CallbackC49122Io.A0O = false;
                        } catch (Exception e) {
                            Log.w("cameraview/take-picture error stopping camera preview", e);
                        }
                        surfaceHolder$CallbackC49122Io.A0T = false;
                        c471729x2.A00(bArr, surfaceHolder$CallbackC49122Io.A0P);
                    }
                };
                this.A07.takePicture(new Camera.ShutterCallback() { // from class: X.2oE
                    @Override // android.hardware.Camera.ShutterCallback
                    public final void onShutter() {
                        C471729x c471729x2 = c471729x;
                        C018508q c018508q = c471729x2.A00.A0s;
                        c018508q.A02.post(new RunnableEBaseShape0S0100000_I0_0(c471729x2, 49));
                    }
                }, null, pictureCallback);
            } catch (Exception e) {
                this.A0T = false;
                Log.e("cameraview/take-picture failed", e);
                A08(1);
            }
        }
    }

    @Override // X.InterfaceC471629w
    public void AVf() {
        Camera camera = this.A07;
        if (camera == null || !this.A0S) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        parameters.setFlashMode(AFr() ? "off" : "torch");
        camera.setParameters(parameters);
    }

    private Camera.CameraInfo getCameraInfo() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.A00, cameraInfo);
        return cameraInfo;
    }

    private List getFallbackSupportedPreviewSizes() {
        ArrayList A0Y = C000200d.A0Y("cameraview/fallback-supported-preview-sizes");
        A0Y.add(new Camera.Size(this.A07, 640, 480));
        return A0Y;
    }

    @Override // X.InterfaceC471629w
    public String getFlashMode() {
        return this.A0M;
    }

    @Override // X.InterfaceC471629w
    public synchronized List getFlashModes() {
        ArrayList arrayList = new ArrayList();
        Camera camera = this.A07;
        if (camera == null) {
            return arrayList;
        }
        try {
            List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
            if (supportedFlashModes != null) {
                if (supportedFlashModes.contains("off")) {
                    arrayList.add("off");
                }
                if (supportedFlashModes.contains("on")) {
                    arrayList.add("on");
                }
                if (supportedFlashModes.contains("auto")) {
                    arrayList.add("auto");
                }
            }
            if (this.A0P) {
                if (!arrayList.contains("off")) {
                    arrayList.add("off");
                }
                if (!arrayList.contains("on")) {
                    arrayList.add("on");
                }
            }
            if (getStoredFlashModeCount() != arrayList.size()) {
                SharedPreferences.Editor edit = getSharedPreferences().edit();
                StringBuilder sb = new StringBuilder();
                sb.append("flash_mode_count");
                sb.append(this.A00);
                edit.putInt(sb.toString(), arrayList.size()).apply();
            }
            return arrayList;
        } catch (RuntimeException e) {
            Log.e("cameraview/getFlashModes ", e);
            return arrayList;
        }
    }

    @Override // X.InterfaceC471629w
    public synchronized int getMaxZoom() {
        int i;
        i = 0;
        Camera camera = this.A07;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.isZoomSupported()) {
                i = parameters.getMaxZoom();
            }
        }
        return i;
    }

    @Override // X.InterfaceC471629w
    public int getNumberOfCameras() {
        return Camera.getNumberOfCameras();
    }

    @Override // X.InterfaceC471629w
    public synchronized long getPictureResolution() {
        Camera camera = this.A07;
        if (camera == null) {
            return 0L;
        }
        Camera.Size pictureSize = camera.getParameters().getPictureSize();
        return pictureSize != null ? pictureSize.width * pictureSize.height : 0L;
    }

    private int getRequiredCameraRotation() {
        int i;
        int rotation = this.A0B.getRotation();
        Camera.CameraInfo cameraInfo = getCameraInfo();
        int i2 = 0;
        boolean z = cameraInfo.facing == 1;
        this.A0P = z;
        int i3 = cameraInfo.orientation;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        if (z) {
            i = ((i3 + i2) + 360) % 360;
        } else {
            i = ((i3 - i2) + 360) % 360;
        }
        C000200d.A1F(C000200d.A0R("cameraview/orientation display:", i2, " camera:", i3, " rotate:"), i);
        return i;
    }

    private SharedPreferences getSharedPreferences() {
        return this.A0L.A01(C02M.A02);
    }

    @Override // X.InterfaceC471629w
    public int getStoredFlashModeCount() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        StringBuilder A0P = C000200d.A0P("flash_mode_count");
        A0P.append(this.A00);
        return sharedPreferences.getInt(A0P.toString(), 0);
    }

    @Override // X.InterfaceC471629w
    public synchronized long getVideoResolution() {
        Camera.Size size;
        size = this.A06;
        return size != null ? size.width * size.height : 0L;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        enable();
        HandlerThread handlerThread = new HandlerThread("Camera");
        this.A0A = handlerThread;
        handlerThread.start();
        this.A09 = new Handler(this.A0A.getLooper());
        if (this.A0Q) {
            this.A0W.A02();
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        disable();
        this.A0A.quit();
        this.A0A = null;
        this.A0W.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0034, code lost:
        if (r1 == 2) goto L19;
     */
    @Override // android.view.SurfaceView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r16, int r17) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolder$CallbackC49122Io.onMeasure(int, int):void");
    }

    @Override // X.InterfaceC471629w
    public void setCameraCallback(InterfaceC49112In interfaceC49112In) {
        this.A0H = interfaceC49112In;
    }

    @Override // X.InterfaceC471629w
    public void setQrDecodeHints(Map map) {
        this.A0W.A02 = map;
    }

    @Override // X.InterfaceC471629w
    public void setQrScanningEnabled(boolean z) {
        this.A0Q = z;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.A07 == null) {
            return;
        }
        if (this.A0C.getSurface() == null) {
            Log.e("cameraview/surface-changed: no surface");
            A08(1);
        } else if (this.A0R) {
        } else {
            this.A09.post(new RunnableEBaseShape0S0200000_I0_0(this, surfaceHolder, 33));
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A09.post(new RunnableEBaseShape1S0100000_I0_1(this, 3));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A09.post(new RunnableEBaseShape1S0100000_I0_1(this, 7));
        A04();
    }
}
