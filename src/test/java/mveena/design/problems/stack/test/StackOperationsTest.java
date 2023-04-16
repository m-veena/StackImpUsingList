package mveena.design.problems.stack.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import mveena.design.problems.stack.StackImp;

class StackOperationsTest {
	private StackImp stackImp;
	
	@BeforeEach
	public void beforeEachTest() {
		stackImp = new StackImp();
	}
	@Test
	void testPushAndTop() {
		stackImp.push(10);
		assertEquals(10, stackImp.top(), "Pushed value and popped value are the same");		
	}

	@Test
	void testMin() {
		stackImp.push(10);
		stackImp.push(20);
		stackImp.push(10);
		stackImp.push(5);
		stackImp.push(1);
		stackImp.pop();
		stackImp.push(8);
		assertEquals(5, stackImp.getMin(), "Minimum value is returned");			
	}


}
