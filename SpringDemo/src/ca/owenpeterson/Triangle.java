package ca.owenpeterson;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;

//	private List<Point> points;

	public void draw() {

		System.out.println("Point A = (" + getPointA().getX() + ", "
				+ getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ", "
				+ getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ", "
				+ getPointC().getY() + ")");

		/*
		 * for (Point point : points) { System.out.println(point.getX() + " " +
		 * point.getY()); }
		 */
	}

/*	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}*/

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;

	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is: " + beanName);

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Triangle");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable Beans destroy method called for Triangle");
		
	}
	
	public void myInit() {
		System.out.println("My init method called for Triangle");
	}
	
	public void myDestroy() {
		System.out.println("My destroy method called for Triangle");
	}

}
