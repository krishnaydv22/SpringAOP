## 🌱 Spring AOP (Aspect-Oriented Programming)

Spring AOP is used to handle cross-cutting concerns separately from business logic.

**🔧 Common Cross-Cutting Concerns**

Logging

Security

Performance monitoring

Transactions

Exception handling

**🏗️ How Spring AOP Works**

Uses proxy-based mechanism

Applies aspects at runtime

Works only with Spring-managed beans

**🧱 Core AOP Concepts**
Concept	Description
Aspect	Cross-cutting logic
Advice	Action taken by an aspect
Join Point	Method execution
Pointcut	Expression selecting join points
Weaving	Applying aspects

**Important Annotations**
**🎯 @Target**

Defines where an annotation can be applied.

@Target(ElementType.METHOD)


Common targets:

METHOD – methods

CLASS / TYPE – classes

FIELD – variables

PARAMETER – method parameters

➡️ Restricts misuse of annotations.

**🧬 @Retention**

Specifies how long the annotation is available.

@Retention(RetentionPolicy.RUNTIME)


Retention types:

SOURCE – discarded at compile time

CLASS – stored in .class file (default)

RUNTIME – available via reflection (required for Spring AOP)

➡️ Spring AOP requires RUNTIME retention.

**🧠 @Aspect**

Marks a class as an Aspect (cross-cutting logic).

@Aspect


Used to define:

Logging

Performance monitoring

Security

Transactions

➡️ Core annotation of Aspect-Oriented Programming.

**🔁 @Around**

Executes before and after the target method.

**@Around("pointcut")**


Key features:

Can control method execution

Can modify input/output

Must call joinPoint.proceed()

@Around("@annotation(TimeMonitor)")
public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable {
    long start = System.currentTimeMillis();
    Object result = joinPoint.proceed();
    long end = System.currentTimeMillis();
    return result;
}


➡️ Most powerful advice in Spring AOP.

**▶️ @Before**

Executes before the target method.

@Before("pointcut")


Use cases:

Validation

Authorization

Logging inputs

⚠️ Cannot stop or modify method execution.

**⏹️ @After**

Executes after the target method (success or failure).

**@After("pointcut")**


Use cases:

Resource cleanup

Logging



