package X;

import android.opengl.GLES20;
import com.whatsapp.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* renamed from: X.3ew */
/* loaded from: classes2.dex */
public class C75463ew {
    public int A00;

    public C75463ew() {
        int A00 = A00(35633, "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n");
        int A002 = A00(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n");
        int glCreateProgram = GLES20.glCreateProgram();
        this.A00 = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, A00);
            GLES20.glAttachShader(this.A00, A002);
            GLES20.glLinkProgram(this.A00);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.A00, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(A00);
                GLES20.glDeleteShader(A002);
                C02180Ae.A1D("Creating GlShader");
                return;
            }
            StringBuilder A0P = C000200d.A0P("GlShader Could not link program: ");
            A0P.append(GLES20.glGetProgramInfoLog(this.A00));
            Log.e(A0P.toString());
            throw new RuntimeException(GLES20.glGetProgramInfoLog(this.A00));
        }
        StringBuilder A0P2 = C000200d.A0P("glCreateProgram() failed. GLES20 error: ");
        A0P2.append(GLES20.glGetError());
        throw new RuntimeException(A0P2.toString());
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                C02180Ae.A1D("compileShader");
                return glCreateShader;
            }
            StringBuilder A0Q = C000200d.A0Q("GlShader Could not compile shader ", i, ":");
            A0Q.append(GLES20.glGetShaderInfoLog(glCreateShader));
            Log.e(A0Q.toString());
            throw new RuntimeException(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        StringBuilder A0P = C000200d.A0P("glCreateShader() failed. GLES20 error: ");
        A0P.append(GLES20.glGetError());
        throw new RuntimeException(A0P.toString());
    }

    public int A01(String str) {
        int i = this.A00;
        if (i != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            throw new RuntimeException(C000200d.A0I("Could not locate uniform '", str, "' in program"));
        }
        throw new RuntimeException("The program has been released");
    }

    public void A02(String str, FloatBuffer floatBuffer) {
        int i = this.A00;
        if (i == -1) {
            throw new RuntimeException("The program has been released");
        }
        if (i != -1) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
            if (glGetAttribLocation >= 0) {
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) floatBuffer);
                C02180Ae.A1D("setVertexAttribArray");
                return;
            }
            throw new RuntimeException(C000200d.A0I("Could not locate '", str, "' in program"));
        }
        throw new RuntimeException("The program has been released");
    }
}
