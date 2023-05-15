CREATE TABLE question
(
	id SERIAL PRIMARY KEY,
	text_question VARCHAR(100) NOT NULL UNIQUE,
	right_answer INT
);

CREATE TABLE answer
(
	id SERIAL PRIMARY KEY,
	text_answer VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE question_answer
(
	question_id INT REFERENCES question(id),
	number_answer INT NOT NULL,
	answer_id INT REFERENCES answer(id),
	CONSTRAINT X PRIMARY KEY (question_id, answer_id),
	right_answer INT 
);

DROP TABLE question_answer;

SELECT * FROM question;
SELECT * FROM answer;
---------------------------------------------------

INSERT INTO question(text_question, right_answer) 
VALUES ('Начнём с простого: что такое Java?', 3);

INSERT INTO question(text_question, right_answer) 
VALUES ('Что из следующего является диапазоном char в Java?', 3);

INSERT INTO question(text_question, right_answer) 
VALUES ('Какие из этих операторов можно использовать для объединения двух или более объектов String?', 1);

---------------------------------------------------

--1
INSERT INTO answer(text_answer) 
VALUES ('Мотоцикл'), ('Чай'), ('Язык программирования'), ('Остров');



INSERT INTO question_answer(question_id, number_answer, answer_id, right_answer) 
VALUES (1,1,1,3), (1,2,2,3), (1,3,3,3), (1,4,4,3);

--2
INSERT INTO answer(text_answer) 
VALUES ('От -128 до 127'), ('От 0 до 256'), ('От 0 до 65535');

INSERT INTO question_answer(question_id, number_answer, answer_id, right_answer) 
VALUES (2,1,5,3), (2,2,6,3), (2,3,7,3);

--3
INSERT INTO answer(text_answer) 
VALUES ('+'), ('*='), ('+='), ('&&'), ('||');

INSERT INTO question_answer(question_id, number_answer, answer_id, right_answer) 
VALUES (3,1,8,1 ), (3,2,9,1), (3,3,10,1), (3,4,11,1), (3,5,12,1);

-----------------------------------------------
SELECT * FROM question_answer;
DROP TABLE question_answer;
UPDATE answer SET number_answer = 3 where id = 7;

SELECT question.text_question, question_answer.number_answer, answer.text_answer, 
question_answer.right_answer FROM question 
LEFT JOIN question_answer ON question_answer.question_id = question.id 
LEFT JOIN answer ON question_answer.answer_id = answer.id; 
