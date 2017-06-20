package org.codehaus.groovy.classgen.asm.util;


import org.objectweb.asm.Attribute;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.util.Printer;
import org.objectweb.asm.util.Textifier;

import java.util.List;

/**
 * Logging bytecode generation, which can make debugging easy
 */
public class LoggableTextifier extends Textifier {
//    private static final Logger LOGGER = Logger.getLogger(LoggableTextifier.class.getName());
    private int loggedLineCnt = 0;

    public LoggableTextifier() {
        super(Opcodes.ASM6);
    }

    @Override
    protected Textifier createTextifier() {
        return new LoggableTextifier();
    }

    protected void log() {
        int textSize = text.size();

        for (int i = loggedLineCnt; i < textSize; i++) {
            Object bc = text.get(i);

            if (bc instanceof List && 0 == ((List) bc).size()) {
                continue;
            }

            System.out.print(bc);
        }

        loggedLineCnt = textSize;
    }


    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
        log();
    }

    @Override
    public void visitSource(String file, String debug) {
        super.visitSource(file, debug);
        log();
    }

    @Override
    public Printer visitModule() {
        Printer p = super.visitModule();
        log();
        return p;
    }

    @Override
    public void visitOuterClass(String owner, String name, String desc) {
        super.visitOuterClass(owner, name, desc);
        log();
    }

    @Override
    public Textifier visitClassAnnotation(String desc, boolean visible) {
        Textifier t = super.visitClassAnnotation(desc, visible);
        log();
        return t;
    }

    @Override
    public Textifier visitClassTypeAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        Textifier t = super.visitClassTypeAnnotation(typeRef, typePath, desc, visible);
        log();
        return t;
    }

    @Override
    public void visitClassAttribute(Attribute attr) {
        super.visitClassAttribute(attr);
        log();
    }

    @Override
    public void visitInnerClass(String name, String outerName, String innerName, int access) {
        super.visitInnerClass(name, outerName, innerName, access);
        log();
    }

    @Override
    public Textifier visitField(int access, String name, String desc, String signature, Object value) {
        Textifier t = super.visitField(access, name, desc, signature, value);
        log();
        return t;
    }

    @Override
    public Textifier visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        Textifier t = super.visitMethod(access, name, desc, signature, exceptions);
        log();
        return t;
    }

    @Override
    public void visitClassEnd() {
        super.visitClassEnd();
        log();
    }

    @Override
    public void visitRequire(String require, int access) {
        super.visitRequire(require, access);
        log();
    }

    @Override
    public void visitExport(String export, String... tos) {
        super.visitExport(export, tos);
        log();
    }

    @Override
    public void visitUse(String use) {
        super.visitUse(use);
        log();
    }

    @Override
    public void visitProvide(String provide, String with) {
        super.visitProvide(provide, with);
        log();
    }

    @Override
    public void visitModuleEnd() {
        super.visitModuleEnd();
        log();
    }

    @Override
    public void visit(String name, Object value) {
        super.visit(name, value);
        log();
    }

    @Override
    public void visitEnum(String name, String desc, String value) {
        super.visitEnum(name, desc, value);
        log();
    }

    @Override
    public Textifier visitAnnotation(String name, String desc) {
        Textifier t = super.visitAnnotation(name, desc);
        log();
        return t;
    }

    @Override
    public Textifier visitArray(String name) {
        Textifier t = super.visitArray(name);
        log();
        return t;
    }

    @Override
    public void visitAnnotationEnd() {
        super.visitAnnotationEnd();
        log();
    }

    @Override
    public Textifier visitFieldAnnotation(String desc, boolean visible) {
        Textifier t = super.visitFieldAnnotation(desc, visible);
        log();
        return t;
    }

    @Override
    public Textifier visitFieldTypeAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        Textifier t = super.visitFieldTypeAnnotation(typeRef, typePath, desc, visible);
        log();
        return t;
    }

    @Override
    public void visitFieldAttribute(Attribute attr) {
        super.visitFieldAttribute(attr);
        log();
    }

    @Override
    public void visitFieldEnd() {
        super.visitFieldEnd();
        log();
    }

    @Override
    public void visitParameter(String name, int access) {
        super.visitParameter(name, access);
        log();
    }

    @Override
    public Textifier visitAnnotationDefault() {
        Textifier t = super.visitAnnotationDefault();
        log();
        return t;
    }

    @Override
    public Textifier visitMethodAnnotation(String desc, boolean visible) {
        Textifier t = super.visitMethodAnnotation(desc, visible);
        log();
        return t;
    }

    @Override
    public Textifier visitMethodTypeAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        Textifier t = super.visitMethodTypeAnnotation(typeRef, typePath, desc, visible);
        log();
        return t;
    }

    @Override
    public Textifier visitParameterAnnotation(int parameter, String desc, boolean visible) {
        Textifier t = super.visitParameterAnnotation(parameter, desc, visible);
        log();
        return t;
    }

    @Override
    public void visitMethodAttribute(Attribute attr) {
        super.visitMethodAttribute(attr);
        log();
    }

    @Override
    public void visitCode() {
        super.visitCode();
        log();
    }

    @Override
    public void visitFrame(int type, int nLocal, Object[] local, int nStack, Object[] stack) {
        super.visitFrame(type, nLocal, local, nStack, stack);
        log();
    }

    @Override
    public void visitInsn(int opcode) {
        super.visitInsn(opcode);
        log();
    }

    @Override
    public void visitIntInsn(int opcode, int operand) {
        super.visitIntInsn(opcode, operand);
        log();
    }

    @Override
    public void visitVarInsn(int opcode, int var) {
        super.visitVarInsn(opcode, var);
        log();
    }

    @Override
    public void visitTypeInsn(int opcode, String type) {
        super.visitTypeInsn(opcode, type);
        log();
    }

    @Override
    public void visitFieldInsn(int opcode, String owner, String name, String desc) {
        super.visitFieldInsn(opcode, owner, name, desc);
        log();
    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name, String desc) {
        super.visitMethodInsn(opcode, owner, name, desc);
        log();
    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
        super.visitMethodInsn(opcode, owner, name, desc, itf);
        log();
    }

    @Override
    public void visitInvokeDynamicInsn(String name, String desc, Handle bsm, Object... bsmArgs) {
        super.visitInvokeDynamicInsn(name, desc, bsm, bsmArgs);
        log();
    }

    @Override
    public void visitJumpInsn(int opcode, Label label) {
        super.visitJumpInsn(opcode, label);
        log();
    }

    @Override
    public void visitLabel(Label label) {
        super.visitLabel(label);
        log();
    }

    @Override
    public void visitLdcInsn(Object cst) {
        super.visitLdcInsn(cst);
        log();
    }

    @Override
    public void visitIincInsn(int var, int increment) {
        super.visitIincInsn(var, increment);
        log();
    }

    @Override
    public void visitTableSwitchInsn(int min, int max, Label dflt, Label... labels) {
        super.visitTableSwitchInsn(min, max, dflt, labels);
        log();
    }

    @Override
    public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {
        super.visitLookupSwitchInsn(dflt, keys, labels);
        log();
    }

    @Override
    public void visitMultiANewArrayInsn(String desc, int dims) {
        super.visitMultiANewArrayInsn(desc, dims);
        log();
    }

    @Override
    public Textifier visitInsnAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        Textifier t = super.visitInsnAnnotation(typeRef, typePath, desc, visible);
        log();
        return t;
    }

    @Override
    public void visitTryCatchBlock(Label start, Label end, Label handler, String type) {
        super.visitTryCatchBlock(start, end, handler, type);
        log();
    }

    @Override
    public Textifier visitTryCatchAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        Textifier t = super.visitTryCatchAnnotation(typeRef, typePath, desc, visible);
        log();
        return t;
    }

    @Override
    public void visitLocalVariable(String name, String desc, String signature, Label start, Label end, int index) {
        super.visitLocalVariable(name, desc, signature, start, end, index);
        log();
    }

    @Override
    public Textifier visitLocalVariableAnnotation(int typeRef, TypePath typePath, Label[] start, Label[] end, int[] index, String desc, boolean visible) {
        Textifier t = super.visitLocalVariableAnnotation(typeRef, typePath, start, end, index, desc, visible);
        log();
        return t;
    }

    @Override
    public void visitLineNumber(int line, Label start) {
        super.visitLineNumber(line, start);
        log();
    }

    @Override
    public void visitMaxs(int maxStack, int maxLocals) {
        super.visitMaxs(maxStack, maxLocals);
        log();
    }

    @Override
    public void visitMethodEnd() {
        super.visitMethodEnd();
        log();
    }

    @Override
    public Textifier visitAnnotation(String desc, boolean visible) {
        Textifier t = super.visitAnnotation(desc, visible);
        log();
        return t;
    }

    @Override
    public Textifier visitTypeAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        Textifier t = super.visitTypeAnnotation(typeRef, typePath, desc, visible);
        log();
        return t;
    }

    @Override
    public void visitAttribute(Attribute attr) {
        super.visitAttribute(attr);
        log();
    }

}
