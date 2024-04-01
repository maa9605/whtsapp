package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.SparseArray;
import com.whatsapp.emoji.EmojiDescriptor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import org.json.JSONObject;

/* renamed from: X.3L6 */
/* loaded from: classes2.dex */
public class C3L6 extends C2HI {
    public BitmapDrawable A00;
    public C2CI A01;
    public final Context A02;
    public final C40081rY A03;
    public final boolean A04;
    public final boolean A05;

    public C3L6(C2CI c2ci, Context context, C40081rY c40081rY, boolean z, boolean z2) {
        this.A02 = context;
        this.A03 = c40081rY;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = c2ci;
        A0H();
    }

    public C3L6(Context context, C40081rY c40081rY, JSONObject jSONObject) {
        this.A02 = context;
        this.A03 = c40081rY;
        this.A05 = jSONObject.getBoolean("png");
        this.A04 = false;
        if (jSONObject.has("emoji")) {
            this.A01 = new C2CI(jSONObject.getString("emoji"));
            A0H();
            super.A0B(jSONObject);
        }
    }

    @Override // X.C2HI, X.C2HG
    public void A0F(RectF rectF, float f, float f2, float f3, float f4) {
        super.A0F(rectF, f, f2, f3, f4);
        if (this.A04) {
            return;
        }
        RectF rectF2 = super.A03;
        if (rectF2.width() > 128.0f || rectF2.height() > 128.0f) {
            A05(Math.min(128.0f / rectF2.width(), 128.0f / rectF2.height()));
        }
    }

    @Override // X.C2HG
    public void A0G(JSONObject jSONObject) {
        super.A0G(jSONObject);
        C2CI c2ci = this.A01;
        if (c2ci != null) {
            jSONObject.put("emoji", c2ci.toString());
        }
        jSONObject.put("png", this.A05);
    }

    public final void A0H() {
        Bitmap bitmap;
        C2CI c2ci = this.A01;
        if (c2ci != null) {
            C43941yG c43941yG = new C43941yG(c2ci.A00);
            int descriptor = EmojiDescriptor.getDescriptor(c43941yG);
            if (this.A05 && !this.A04) {
                C40081rY c40081rY = this.A03;
                Context context = this.A02;
                BitmapDrawable bitmapDrawable = null;
                InterfaceC44051yR interfaceC44051yR = new InterfaceC44051yR() { // from class: X.3HX
                    @Override // X.InterfaceC44051yR
                    public void AJo() {
                    }

                    {
                        C3L6.this = this;
                    }

                    @Override // X.InterfaceC44051yR
                    public void ANc(Object obj) {
                        C3L6.this.A0H();
                    }
                };
                synchronized (c40081rY) {
                    if (descriptor == -1) {
                        descriptor = EmojiDescriptor.getDescriptor(c43941yG);
                        if (descriptor == -1) {
                        }
                    }
                    int i = (descriptor & 4095) + 1;
                    SparseArray sparseArray = c40081rY.A00;
                    SoftReference softReference = (SoftReference) sparseArray.get(descriptor);
                    if (softReference != null && (bitmap = (Bitmap) softReference.get()) != null) {
                        bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                    } else {
                        C43901yB c43901yB = c40081rY.A03;
                        synchronized (c43901yB) {
                            C000700j.A07(i != 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            int i2 = i / 100;
                            if (!c43901yB.A0E(i2)) {
                                Log.e("DoodleEmojiManager/getBitmap/Downloadable files are not ready and getBitmap is called");
                                int A00 = c43901yB.A00(i2);
                                if (A00 != 0) {
                                    if (A00 != 1) {
                                        if (A00 != 2) {
                                            if (A00 != 3) {
                                                if (A00 != 4) {
                                                    if (A00 != 5) {
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append("DoodleEmojiManager/getFilesAsync/Unexpected state ");
                                                        sb.append((String) AbstractC43891yA.A0G.get(Integer.valueOf(A00)));
                                                        Log.e(sb.toString());
                                                        interfaceC44051yR.AJo();
                                                    }
                                                    C000700j.A07(c43901yB.A0E(i2));
                                                    interfaceC44051yR.ANc(c43901yB.A0G(i2));
                                                }
                                            }
                                        }
                                    }
                                    AbstractC43891yA.A0G.get(Integer.valueOf(A00));
                                    c43901yB.A09(interfaceC44051yR, i2);
                                }
                                if (!c43901yB.A0E(i2)) {
                                    if ((C23X.A01(c43901yB.A0A, c43901yB.A07.A03(true)) & 1) != 0) {
                                        c43901yB.A08(1, i2);
                                        c43901yB.A09(interfaceC44051yR, i2);
                                        c43901yB.A07(0, i2);
                                    } else {
                                        interfaceC44051yR.AJo();
                                    }
                                } else {
                                    c43901yB.A08(5, i2);
                                    C000700j.A07(c43901yB.A0E(i2));
                                    interfaceC44051yR.ANc(c43901yB.A0G(i2));
                                }
                            } else {
                                File file = (File) c43901yB.A00.get(i);
                                if (file != null && file.exists()) {
                                    try {
                                        FileInputStream fileInputStream = new FileInputStream(file);
                                        try {
                                            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                                            if (decodeStream != null) {
                                                sparseArray.put(descriptor, new SoftReference(decodeStream));
                                                bitmapDrawable = new BitmapDrawable(context.getResources(), decodeStream);
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } finally {
                                                try {
                                                    fileInputStream.close();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        }
                                    } catch (IOException e) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("DoodleEmojiManager/getBitmap/Could not get bitmap from downloaded file for ");
                                        sb2.append(file.getName());
                                        Log.e(sb2.toString(), e);
                                    }
                                } else {
                                    c43901yB.A08(0, i2);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("DoodleEmojiManager/getBitmap/Error getting downloaded file to compute bitmap for emojiId=");
                                    sb3.append(i);
                                    Log.e(sb3.toString());
                                }
                            }
                        }
                        bitmapDrawable = c40081rY.A01(context, descriptor, c43941yG);
                    }
                }
                this.A00 = bitmapDrawable;
                return;
            }
            this.A00 = this.A03.A01(this.A02, descriptor, c43941yG);
        }
    }
}
